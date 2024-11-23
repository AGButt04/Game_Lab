
public class Safe extends Item {
	
	public Safe(String name, String des) {
		super(name, des);
	}

	public void open() {
		Item com = Game.returnItem("combination");
		Item safe = Game.returnItem("safe");
		if (com != null) {
			Game.print("Using the combination, you have opened the safe and found a diamond inside! Naturally, you pocket the diamond. Along"
					+ "with the pulse_pendulum.");
			Game.inventory.add(new Item("diamond", "This diamond will help you in troubling times."));
			Game.inventory.add(new Item("pulse_pendulum", "This is the second pendulum of the four."));
			Game.inventory.remove(com);
			Game.inventory.remove(safe);
		} else {
			Game.print("The safe is locked and you don't have the combination.");
		}
	}	

}
