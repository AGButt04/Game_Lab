
public class VeilKey extends Item {
	
	public VeilKey(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Room veil = Game.currentroom.getExit('w');
		if (veil.getName().equals("Gate of Cursed Veil")) {
			Game.print("Gate of Cursed Veil is unlocked!");
			veil.setLock(false);
		}
	}

}
