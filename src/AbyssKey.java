
public class AbyssKey extends Item {
	
	public AbyssKey(String name, String des) {
		super(name,des);
	}
	
	public void use() {
		int count = 0;
		for (Item i : Game.inventory) {
			if (i.getItname().equals("abyssKey")) {
				count++;
			}
		}
		if (count == 1) {
			Room r = Game.currentroom.getExit('e');
			if (r.getName().equals("Gate of Hungering Abyss")) {
				r.setLock(false);
				Game.print("You have unlocked the Gate of Hungering Abyss. Well Done!");	
			}
		} else {
			Game.print("This Gate is unlocked. You need a key which is split in half.");
		}
	}

}
