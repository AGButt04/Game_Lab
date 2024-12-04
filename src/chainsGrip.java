
public class chainsGrip extends Item {
	
	public chainsGrip(String name, String des) {
		super(name,des);
	}
	
	public void use() {
		Item i = Game.returnItem("chains_tip");
		Item c = Game.returnItem("chains_grip");
		if (i != null && c != null) {
			Game.print("You have made the Key of the Gate of Eternal Chains.");
			Game.inventory.add(new ChainsKey("chainsKey", "This key will unlock the Gate of Eternal Chains."));
			Game.inventory.remove(i);
			Game.inventory.remove(c);
		} else {
			Game.print("You have yet to find the other half of the key.");
		}
	}
}
