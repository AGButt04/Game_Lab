
public class ChainsKey extends Item {
	
	public ChainsKey(String name, String des) {
		super(name,des);
	}
	
	public void use() {
		int count = 0;
		for (Item i : Game.inventory) {
			if (i.getItname().equals("chainsKey")) {
				count++;
			}
		}
		if (count == 1) {
			Room r = Game.currentroom.getExit('u');
			if (r.getName().equals("Gate of Eternal Chains")) {
				r.setLock(false);
				Game.print("You have unlocked the Gate of Eternal Chains. Keep your eyes open now.");	
			}
		} else {
			Game.print("This Gate is unlocked. You need a key which is split in half.");
		}
	}
}
