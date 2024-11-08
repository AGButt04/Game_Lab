
public class DirtBag extends Item {
	
	public DirtBag(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		int count = 0;
		for (Item i : Game.inventory) {
			if (i.getItname().equals("candle_lamp")) {
				count++;
				break;
			}
		}
		if (count == 1) {
			System.out.println("You have found the key for the Gate of Cursed Veil.");
			VeilKey veil = new VeilKey("Veilkey", "This key will open Gate of Cursed Veil.");
			Game.inventory.add(veil);
		}  else {
			Game.print("There is just DARKNESS in this Dirt Bag. Find some light.");
		}
	}

}
