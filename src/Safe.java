
public class Safe extends Item {
	
	public Safe(String name, String des) {
		super(name, des);
	}

	public void open() {
		int count = 0;
		for (Item t : Game.inventory) {
			if (t.getItname().equals("combination")) {
				Game.print("Using the combination, you have opened the safe and found a diamond inside! Naturally, you pocket the diamond.");
				count++;
			} else {
				Game.print("The safe is locked and you don't have the combination.");
			}
		}
		if (count >= 1 ) {
			Item diamond = new Item("diamond", "This diamond will help you in troubling times.");
			Game.inventory.add(diamond);
		}
	}	

}
