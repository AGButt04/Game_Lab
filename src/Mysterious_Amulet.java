
public class Mysterious_Amulet extends Item {
	
	public Mysterious_Amulet(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Room pulse = Game.currentroom.getExit('e');
		Room night = Game.currentroom.getExit('d');
		if (pulse != null && pulse.getName().equals("Gate of Hidden Pulse") && night.getName().equals("Gate of Eternal night") && night != null) {
			pulse.setLock(false);
			night.setLock(false);
			Game.print("You have unlocked The Gates of Pulse and Night.");
			Game.inventory.remove(Game.returnItem("mysterious_amulet"));
		} else {
			Game.print("Go to the appropriate room.");
		}
	}
}
