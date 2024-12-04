
public class DirtBag extends Item {
	
	public DirtBag(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item lamp = Game.returnItem("candle_lamp");
		if (lamp != null) {
			Game.print("You have found the Veil's key and lock pick");
			Game.inventory.add(new VeilKey("Veilkey", "This key will open Gate of Cursed Veil."));
			Game.inventory.add(new Item("lockpick", "This can open some locked things"));
			Game.inventory.remove(lamp);
			Game.inventory.remove(Game.returnItem("Dirtbag"));
		}  else {
			Game.print("There is just DARKNESS in this Dirt Bag. Find some light.");
		}
	}

}
