
public class UltimatePendulum extends Item {
	public UltimatePendulum(String name, String des) {
		super(name, des);
	}
		
	public void use() {
		Room r = Game.currentroom.getExit('n');
		if (r.getName().equals("The Devil's Lair")) {
			System.out.println("You have successfully place the Ultimate pendulum and unlocked the Gate of Devil's Lair! Final Battle begins!");
			r.setLock(false);
		} else {
			System.out.println("You must be in the right room to unlock the Gate.");
		}
	}
}
