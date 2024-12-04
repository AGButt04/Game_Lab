
public class AbyssKey extends Item {
	
	public AbyssKey(String name, String des) {
		super(name,des);
	}
	
	public void use() {
		Item key = Game.returnItem("abyssKey");
		Room r = Game.currentroom.getExit('e');
		if (r != null && r.getName().equals("Gate of Hungering Abyss") && key != null) {
			r.setLock(false);
			Game.print("You have unlocked the Gate of Hungering Abyss. Well Done!");
			Game.inventory.remove(key);
		} else {
			Game.print("Go into the appropriate room to open the gate.");
		}
	}
}
