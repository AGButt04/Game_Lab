
public class Bushes extends Item {
	
	public Bushes(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item acid = Game.returnItem("H2SO4");
		Item bushes = Game.returnItem("bushes");
		if (acid != null) {
			Game.print("The bushes are dissolved and let's see if something was hidden in those.");
			Game.inventory.add(new chainsGrip("chains_grip", "This is the second half of the key of the Gate of the Eternal Chains."));
			Game.inventory.add(new Casing("casing", "This is the last part for the shotgun's deadly round that will kill the devil."));
			Game.print("You have found the Grip of the Chain's key and casing of the shotgun round. Try using it.");
			Game.inventory.remove(acid);
			Game.inventory.remove(bushes);
		} else {
			Game.print("You need something to dissolve these bushes.");
			
		}
	}

}
