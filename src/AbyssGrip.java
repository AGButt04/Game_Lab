
public class AbyssGrip extends Item {
	
	public AbyssGrip(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		int count = 0;
		for (Item i : Game.inventory) {
			if (i.getItname().equals("abyss_tip")) {
				count++;
			}
		}
		
		if (count == 1) {
			Item i = Game.returnItem("abyss_tip");
			Item c = Game.returnItem("abyss_grip");
			Game.inventory.remove(i);
			Game.inventory.remove(c);
			Game.print("You have made the Key of the Gate of Hungering Abyss.");
			Game.inventory.add(new AbyssKey("abyssKey", "This key will unlock the Gate of Hungering Abyss."));
		} else {
			Game.print("You have yet to find the other half of the key.");
		}
	}

}
