
public class UltimatePendulum extends Item {
	public UltimatePendulum(String name, String des) {
		super(name, des);
	}
		
	public void use() {
		Room r = Game.currentroom.getExit('n');
		Item p = Game.returnItem("ultimate_pendulum");
		if (r != null && r.getName().equals("The Devil's Lair") && p != null) {
			Game.print("You have successfully place the Ultimate pendulum and unlocked the Gate of Devil's Lair! Final Battle begins!");
			r.setLock(false);
			Game.inventory.remove(p);
		} else {
			Game.print("You must be in the right room to unlock the Gate.");
		}
	}
}
