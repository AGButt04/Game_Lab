
public class Vase extends Item {
	
	public Vase(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Item hammer = Game.returnItem("hammer");
		if (hammer != null) {
			Game.print("You have smashed the Vase and found the Heart Stone Fragment.");
			Game.inventory.add(new Item("heart_fragment", "This will help you in weakening the King's heart."));
			Game.inventory.remove(Game.returnItem("Vase"));
		} else {
			Game.print("This Vase has the potential to get smashed");
		}
	}

}
