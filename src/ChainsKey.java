
public class ChainsKey extends Item {
	
	public ChainsKey(String name, String des) {
		super(name,des);
	}
	
	public void use() {
		Room r = Game.currentroom.getExit('u');
		Item key = Game.returnItem("chainsKey");
		if (r != null && r.getName().equals("Gate of Eternal Chains") && key != null) {
			r.setLock(false);
			Game.print("You have unlocked the Gate of Eternal Chains. Keep your eyes open now.");
			Game.inventory.remove(key);
		} else {
			Game.print("Go into appropriate room.");
		}
	}
}
