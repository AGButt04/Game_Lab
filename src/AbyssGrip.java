
public class AbyssGrip extends Item {
	
	public AbyssGrip(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Item i = Game.returnItem("abyss_tip");
		Item c = Game.returnItem("abyss_grip");
		if (i != null && c != null) {
			Game.print("You have made the Key of the Gate of Hungering Abyss.");
			Game.inventory.add(new AbyssKey("abyssKey", "This key will unlock the Gate of Hungering Abyss."));
			Game.inventory.remove(i);
			Game.inventory.remove(c);
		} else {
			Game.print("You have yet to find the other half of the key.");
		}
	}

}
