
public class SteelBox extends Item {
	
	public SteelBox(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item acid = Game.returnItem("H2SO4");
		if (acid != null) {
			Game.print("You have dissolved the lock and opened the box. You received Abyss key's grip and hammer.");
			Game.inventory.add(new AbyssGrip("abyss_grip", "This is the second half of the key that will open the Gate of Hungering Abyss"));
			Game.inventory.add(new Item("hammer", "Use this to break things that you can."));
			Game.inventory.remove(acid);
			Game.inventory.remove(Game.returnItem("steel_box"));
		} else {
			Game.print("Find something to dissolve this lock.");
		}
	}

}
