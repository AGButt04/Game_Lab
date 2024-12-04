
public class Casing extends Item {
	
	public Casing(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Item p = Game.returnItem("gunpowder");
		Item b = Game.returnItem("bullet");
		if (p != null && b != null) {
			Game.print("You have forged a deadly round to kill the devil!");
			Game.inventory.add(new Item("deadly_round", "This is the round that will kill the devil."));
			Game.inventory.remove(p);
			Game.inventory.remove(b);
			Game.inventory.remove(Game.returnItem("casing"));
		} else {
			Game.print("You are missing items.");
		}
	}
}
