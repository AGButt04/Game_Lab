
public class GoldChest extends Item {
	
	public GoldChest(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Game.print("You need a 5-digit pin to open this chest. When you have figured out the pin, write 'pin XXXXX', whatever your pin might be in the text field");
	}

}
