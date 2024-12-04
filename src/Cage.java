
public class Cage extends Item {
	
	public Cage(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item lockpick = Game.returnItem("lockpick");
		if (lockpick != null) {
			Game.print("You have opened the cage using lockpick and chain's tip.");
			Game.inventory.add(new Item("chains_tip", "This is tip of the key to the Gate of eternal chains."));
			Game.inventory.remove(lockpick);
			Game.inventory.remove(Game.returnItem("cage"));
		} else {
			Game.print("Find something to open this cage");
		}
	}

}
