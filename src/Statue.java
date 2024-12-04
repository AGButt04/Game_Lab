
public class Statue extends Item {
	
	public Statue(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item hammer = Game.returnItem("hammer");
		Item knife = Game.returnItem("knife");
		Item shovel = Game.returnItem("rusty_shovel");
		
		if (hammer != null && knife != null && shovel != null) {
			Game.print("You have successfully broke open the Statue of Sukuna. Check to see your inventory what you got!");
			Game.inventory.add(new Item("dagger_blade", "This is the last part, the blade of the Sacred Dagger."));
			Game.inventory.remove(Game.returnItem("statue"));
		} else {
			Game.print("You need all the weapons like things you can get to break open this statue");
		}
	}

}
