
public class Inscription extends Item {
	
	public Inscription(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		String s = "Long ago, this graveyard was part of a thriving village, home to families, artisans, and travelers passing through.\n"
				+ "But everything changed when a forbidden ritual was performed to summon a dark force, \n"
				+ "meant to protect the village in times of famine and war. Instead, it unleashed a curse of eternal torment. \n"
				+ "The townsfolk were struck down, each one seemingly cursed to wander this land after death, their spirits bound to the soil.\n"
				+ "There is only one way to heal this village, which is somewhere hidden. \n";
		Game.print(s);
		Game.inventory.remove(Game.returnItem("inscription"));
		}
}
