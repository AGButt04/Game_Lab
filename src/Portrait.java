
public class Portrait extends Item {
	
	public Portrait(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item knife = Game.returnItem("knife");
		if (knife != null) {
			Game.print("You have opened the portrait and received a part of Abyss key!");
			Game.inventory.remove(Game.returnItem("Portrait"));
			Game.inventory.add(new Item("abyss_tip", "This is the first half of the key of Gate of Hungering Abyss"));
		} else {
			Game.print("You need something pointy to open its back screw");
		}
	}

}
