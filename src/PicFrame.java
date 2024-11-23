
public class PicFrame extends Item {
	public PicFrame(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		int count = 0;
		for (Item i : Game.inventory) {
			if (i.getItname().equals("hammer")) {
				count++;
			}
		}
		
		if (count > 0) {
			System.out.println("You have found the night pendulum! When you have all four try using the Abyss Pendulum.");
			Game.inventory.add(new Item("night_pendulum", "This is the third pendulum of the four"));
		} else {
			System.out.println("Try finding something to break this open.");
		}
	}

}
