
public class Wooden_Chest extends Item {
	
	public Wooden_Chest(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item sh = Game.returnItem("rusty_shovel");
		if (sh != null) {
			String s = 	 "The Golden Chest of curses. It posses the heart of the devil who is the king of curses, Sukuna,\n and you have to find the "
					+ "Sacred Dagger, and stab his heart to kill him and forever heal this village. You get a gold plate and first of the 4 pendulums that you need to open"
					+ " the Gate of Devil's Lair. ";
			Game.print(s);
			Item pendulum_1 = new Item("veil_pendulum", "This is the first piece of pendulum puzzle. ");
			Item gold_plate = new Item("gold_plate", "This will help you in the times of crisis. ");
			Game.inventory.remove(Game.returnItem("wooden_chest"));
			Game.inventory.add(gold_plate);
			Game.inventory.add(pendulum_1);
		} else {
			Game.print("You need something to break this chest.");
		}
	}

}
