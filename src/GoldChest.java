
public class GoldChest extends Item {
	
	public GoldChest(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item chest = Game.returnItem("Gold_Cursed_Chest");
		if (chest != null) {
			Game.print("Enter the pin to open the chest: ");
			int pin = Game.input.nextInt();
			if (pin == 43511) {
				Game.print("You have successfully opened the Gold chest of curses and acquired the heart of the King, Sukuna!");
				Game.inventory.add(new Item("Sukuna's_heart", "This is the heart that you have to stab with Sacred Dagger to lift up the curse!"));
				Game.inventory.remove(chest);
			} else {
				Game.print("The pin is incorrect.\n Hint: Draw the thing that stopped you to get lost.");
			}
		} else {
			Game.print("Go get the f**king chest first!");
		}
		
	}

}
