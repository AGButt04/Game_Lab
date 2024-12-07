import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Game {
	public static void main(String[] args) {
		GUI = new GameUserInterface();
		inventory = new ArrayList<Item> ();
		currentroom = World.buildWorld();
		DesMap();
		print(currentroom);
		//runGame();	
	}
	
	public static GameUserInterface GUI;
	public static ArrayList<Item> inventory; //static belongs to a class.

	static Room currentroom;
	
	public static HashMap<String, Room> rooms = new HashMap<>();
	
	public static HashMap<String, String> descriptions = new HashMap<>();

	public static Scanner input = new Scanner(System.in);

	
	public static Item call(String it) {
		for (Item i : inventory) {
			if (i.getItname().equals(it)) {
				return i;
			}
		}
		Game.print("There is no such item in your inventory.");
		return null;
	}
	
	public static void print(Object ob) {//(Object obj)
		GUI.text.append(ob.toString() + "\n");
		//System.out.println(ob);
	}
	
	public static Item returnItem(String name) {
		for (Item t : inventory) {
			if(t.getItname().equals(name)) {
				return t;
			}
		}
		return null;
	}
	
	public static void saveGame() {
		File f = new File("SaveGame");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream stream = new ObjectOutputStream(fos);
			stream.writeObject(currentroom);
			stream.writeObject(inventory);
			stream.writeObject(rooms);
			stream.close();
		} catch (IOException ex) {
			System.out.println("Program malfunctioned!");
			ex.printStackTrace();
		}
	}
	
	public static void loadGame() {
		File f = new File("SaveGame");
		try {
			FileInputStream fos = new FileInputStream(f);
			ObjectInputStream stream = new ObjectInputStream(fos);
			currentroom = (Room) stream.readObject();
			inventory = (ArrayList) stream.readObject();
			rooms = (HashMap) stream.readObject();
			stream.close();
		} catch (IOException ex) {
			System.out.println("Can't load man!");
		} catch (ClassNotFoundException e) {
			System.out.println("No such class exist.");
		}
	}

	
	public static void DesMap() {
		try {
			Scanner input2 = new Scanner(new File("Room Descriptions"));
			while (input2.hasNextLine()) {
				String name = input2.nextLine();
				String des = input2.nextLine();
				input2.nextLine();
				descriptions.put(name, des);
			}
		} catch (FileNotFoundException e) {
			System.out.println("There is no file with room descriptions.");
		}
	}
	
	public static void processCommand(String command) {
		String[] words;
		words = command.split(" ");

		switch (words[0]) { //command.toLowerCase will work too. Command is a string so the comparing have to be in strings and double quotes.
		case "e":
		case "w":
		case "n":
		case "s":
		case "u":
		case "d":
			if (currentroom.checkExit(currentroom, command.charAt(0))) {
				if (currentroom.getExit(command.charAt(0)).getLock()) {
					if (currentroom.getExit(command.charAt(0)).getName().equals("The Gate of Infinite Curses")) {
						Game.print("There is a devil in your way. Kill him before entering the final gate.");
					} else {
						Game.print(currentroom.getExit(command.charAt(0)).getName() +" requires a key which you do not possess. Don't come back until you are worthy of it.");	
					}
				} else {
					currentroom = currentroom.getExit(command.charAt(0));
					print(currentroom);
				}
			} else {
				Game.print("There is nothing but darkness in this direction. GO BACK!");
			}
			break;
		case "location":
			print(currentroom);
			break;
		case "use":
			Item its = currentroom.getItem(words[1]);
			if (its == null) {
				Item i1 = call(words[1]);
				if (i1 != null) 
					i1.use();
			}
			break;
		case "open":
			Item itss = currentroom.getItem(words[1]);
			if (itss == null) {
				Item i = call(words[1]);
				i.open();
			}
			break;
		case "x":
			Game.print("\nThanks for walking through my game!");
			break;

		case "take":
			Item check = currentroom.getItem(words[1]);
			if (check == null) {
				Game.print("There is no such item in current room.");
			} else {
				check.take();
				if (currentroom.items.size() == 0) {
					String name = currentroom.getName() + 2;
					currentroom.desc = name;
				}
			}
			break;
		case "look":
			Item itt = currentroom.getItem(words[1]);
			if (itt == null) {
				for (Item item : inventory) {
					if (item.getItname().equals(words[1])) {
						Game.print("It is in your inventory. ");
						Game.print(item.getDes());
					}
				}
			} else {
				Game.print(currentroom.getItem(words[1]).getDes());
			}
			break;
		case "i":
		case "I":
			int ch = inventory.size();
			if (ch == 0) {
				Game.print("There is nothing in your inventory yet. You still got some work to do.");
			} else {
				for (Item I : inventory) {
					Game.print(I);
				}
			}
			break;
		case "save":
			saveGame();
			break;
		case "load":
			loadGame();
			break;
		case "talk":
			NPC npc = currentroom.getNPC(words[1]);
			if (npc == null) {
				Game.print("There is no such thing in this room.");
			} else {
				npc.talk();
			}
			break;
		case "pin":
			String pin = words[1];
			Item chest = Game.returnItem("Gold_Cursed_Chest");
			if (chest != null && pin != null) {
				if (pin.equals("43511")) {
					print("You have successfully opened the Gold chest of curses and acquired the heart of the King, Sukuna!");
					inventory.add(new Item("Sukuna's_heart", "This is the heart that you have to stab with Sacred Dagger to lift up the curse!"));
					inventory.remove(chest);
				} else {
					print("The pin is incorrect.\nHint: Draw the thing that stopped you to get lost.");
				}
			} else {
				print("Go get the chest first!");
			}
			break;
		default:
			print("I don't know what that means. Invalid input.");
		}
	}
	public static void runGame() {
		inventory = new ArrayList<Item> ();
		currentroom = World.buildWorld();

		String command; //Player's command
		String[] words;
		do {
			System.out.println(currentroom);
			System.out.print("\nWhat's your next move? "); //print does not go to the next line
			command = input.nextLine();
			words = command.split(" ");
			
			switch (words[0]) { //command.toLowerCase will work too. Command is a string so the comparing have to be in strings and double quotes.
			case "e":
			case "w":
			case "n":
			case "s":
			case "u":
			case "d":
				if (currentroom.checkExit(currentroom, command.charAt(0))) {
					if (currentroom.getExit(command.charAt(0)).getLock()) {
						if (currentroom.getName().equals("The Gate of Infinite Curses")) {
							System.out.println("There is a devil in your way. Kill him before entering the final gate.");
						} else {
							System.out.println("The " + currentroom.getExit(command.charAt(0)).getName() +" requires a key which you do not possess. Don't come back until you are worthy of it.");	
						}
					} else {
						currentroom = currentroom.getExit(command.charAt(0));
					}
				} else {
					System.out.println("There is nothing but darkness in this direction. GO BACK!");
				}
				break;
			case "use":
				Item its = currentroom.getItem(words[1]);
				if (its == null) {
					Item i1 = call(words[1]);
					if (i1 != null) 
						i1.use();
				}
				break;
			case "open":
				Item itss = currentroom.getItem(words[1]);
				if (itss == null) {
					Item i = call(words[1]);
					i.open();
				}
				break;
			case "x":
				System.out.println("\nThanks for walking through my game!");
				break;

			case "take":
				Item check = currentroom.getItem(words[1]);
				if (check == null) {
					System.out.println("There is no such item in current room.");
				} else {
					check.take();
					if (currentroom.items.size() == 0) {
						String name = currentroom.getName() + 2;
						currentroom.desc = name;
					}
				}
				break;
			case "look":
				Item itt = currentroom.getItem(words[1]);
				if (itt == null) {
					for (Item item : inventory) {
						if (item.getItname().equals(words[1])) {
							System.out.println("It is in your inventory. ");
							System.out.println(item.getDes());
						}
					}
				} else {
					System.out.println(currentroom.getItem(words[1]).getDes());
				}
				break;
			case "i":
			case "I":
				int ch = inventory.size();
				if (ch == 0) {
					System.out.println("There is nothing in your inventory yet. You still got some work to do.");
				} else {
					for (Item I : inventory) {
						System.out.println(I);
					}
				}
				break;
			case "save":
				saveGame();
				break;
			case "load":
				loadGame();
				break;
			case "talk":
				NPC npc = currentroom.getNPC(words[1]);
				if (npc == null) {
					System.out.println("There is no such thing in this room.");
				} else {
					npc.talk();
				}
				break;
			default:
				System.out.println("I don't know what that means. Invalid input.");					
			}
		
		} while(!command.equals("x"));
	}
}
