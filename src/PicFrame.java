
public class PicFrame extends Item {
	public PicFrame(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item hammer = Game.returnItem("hammer");
		if (hammer != null) {
			Game.print("You have found the night pendulum! When you have all four try using the Abyss Pendulum.");
			Game.inventory.add(new Item("night_pendulum", "This is the third pendulum of the four"));
			Game.inventory.remove(Game.returnItem("picture_frame"));
		} else {
			System.out.println("Try finding something to break this open.");
		}
	}

}
