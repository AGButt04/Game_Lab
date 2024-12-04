
public class Oxygen extends Item {
	
	public Oxygen(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Item s = Game.returnItem("sulphur");
		Item h = Game.returnItem("hydrogen");
		if (s != null && h != null) {
			Game.print("Hydrocloric Acid has been added to your inventory. You can use it to dissolve things.");
			Game.inventory.add(new Item("H2SO4", "This can help you open things that you cannot break."));
			Game.inventory.remove(Game.returnItem("oxygen"));
			Game.inventory.remove(h);
			Game.inventory.remove(s);
		} else {
			Game.print("You do not have all the materials to make the acid.");
		}
	}

}
