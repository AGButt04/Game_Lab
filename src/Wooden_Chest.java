
public class Wooden_Chest extends Item {
	
	public Wooden_Chest(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		int count = 0;
		for (Item i : Game.inventory) {
			if (i.getItname().equals("Rusty_shovel")) {
				count++;
			}
		}
		
		if (count == 1) {
			String s = 	 "The Golden Chest of curses. It posses the heart of the devil who is the king of curses, Sukuna,\n and you have to find the "
					+ "Silk Dagger, and stab his heart to kill him and forever heal this village.";
			System.out.println(s);
			Item gold_plate = new Item("Gold_plate", "This will help you in the times of crisis. ");
			Game.inventory.add(gold_plate);
		} else {
			Game.print("You need something to break this chest.");
		}
	}

}
