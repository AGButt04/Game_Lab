import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		runGame();
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static Item returnItem(String name) {
		for (Item t : inventory) {
			if(t.getItname().equals(name)) {
				return t;
			}
		}
		System.out.println("There is no such item in the player's inventory.");
		return null;
	}
	public static ArrayList<Item> inventory; //static belongs to a class.
	//inventory = new ArrayList<Item> (); Can't be outside of the method.
	static Room currentroom;
	
	public static void runGame() {
		inventory = new ArrayList<Item> ();
		Scanner input = new Scanner(System.in);
		currentroom = World.buildWorld();

		String command; //Player's command
		do {
			System.out.println(currentroom);
			System.out.print("\nWhat's your next move? "); //print does not go to the next line
			command = input.nextLine();
			String[] words = command.split(" ");
			
			switch (words[0]) { //command.toLowerCase will work too. Command is a string so the comparing have to be in strings and double quotes.
			case "e":
			case "w":
			case "n":
			case "s":
			case "u":
			case "d":
				if (currentroom.checkExit(currentroom, command.charAt(0))) {
					currentroom = currentroom.getExit(command.charAt(0));					
				} else {
					System.out.println("There is nothing but darkness in this direction. GO BACK!");
				}
				break;
			case "use":
				Item its = currentroom.getItem(words[1]);
				if (its == null) {
					for (Item t :  inventory) {
						if (t.getItname().equals(words[1])) {
							t.use();
						}
					}
				}
				break;
			case "open":
				Item t2 = null;
				Item itss = currentroom.getItem(words[1]);
				if (itss == null) {
					for (Item t : inventory) {
						if (t.getItname().equals(words[1])) {
							t2 = t;
						}
					}
					t2.open();
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
					System.out.println(currentroom.getItem(words[1]).getItname() + " is added to your inventory!");
					inventory.add(check);
					currentroom.removeItem(words[1]);
				}
				break;
			case "look":
				Item it = currentroom.getItem(words[1]);
				if (it == null) {
					for (Item i : inventory) {
						if (i.getItname().equals(words[1])) {
							System.out.println("It is in your inventory. ");
							System.out.println(i.getDes());
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
			default:
				System.out.println("I don't know what that means. Invalid input.");
								
			}
		
		} while(!command.equals("x"));
	}
}
