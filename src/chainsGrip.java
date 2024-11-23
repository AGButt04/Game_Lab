
public class chainsGrip extends Item {
	
	public chainsGrip(String name, String des) {
		super(name,des);
	}
	
	public void use() {
		int count = 0;
		for (Item i : Game.inventory) {
			if (i.getItname().equals("chains_tip")) {
				count++;
			}
		}
		
		if (count == 1) {
			Item i = Game.returnItem("chains_tip");
			Item c = Game.returnItem("chains_grip");
			Game.inventory.remove(i);
			Game.inventory.remove(c);
			Game.print("You have made the Key of the Gate of Eternal Chains.");
			Game.inventory.add(new ChainsKey("chainsKey", "This key will unlock the Gate of Eternal Chains."));
		} else {
			Game.print("You have yet to find the other half of the key.");
		}
	}
}
