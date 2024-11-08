
public class Mysterious_Amulet extends Item {
	
	public Mysterious_Amulet(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Room pulse = Game.currentroom.getExit('e');
		Room night = Game.currentroom.getExit('d');
		pulse.setLock(false);
		night.setLock(false);
		System.out.println("You have unlocked The Gates of Pulse and Night.");
	}

}
