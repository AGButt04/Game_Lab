
public class RustySword extends Item {
	
	public RustySword(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item sword = Game.returnItem("rustysword");
		Item hammer = Game.returnItem("hammer");
		if (sword != null && hammer != null) {
			Game.print("You have broken the sword with the hammer. Happy now?!");
			Game.inventory.add(new Item("knife", "This knife can help you sometimes."));
			Game.inventory.add(new Item("dagger_grip", "This is the first part, the grip of the Sacred Dagger."));	
			Game.inventory.remove(sword);
		} else {
			Game.print("You need something to break this open.");
		}
	}

}
