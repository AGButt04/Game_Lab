
public class VeilKey extends Item {
	
	public VeilKey(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Item key = Game.returnItem("Veilkey");
		Room veil = Game.currentroom.getExit('w');
		if (veil != null && veil.getName().equals("Gate of Cursed Veil") && key != null) {
			Game.print("Gate of Cursed Veil is unlocked!");
			veil.setLock(false);
			Game.inventory.remove(Game.returnItem("Veilkey"));
		} else {
			Game.print("Go into the appropriate room.");
		}
	}

}
