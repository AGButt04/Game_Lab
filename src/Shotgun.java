
public class Shotgun extends Item {
	
	public Shotgun(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Item round = Game.returnItem("deadly_round");
		Item h = Game.returnItem("health");
		if (h != null) {
			if (round != null && Game.currentroom.getName().equals("The Devil's Lair")) {
				Game.print("You have killed that motherfucker and acquired the dagger's lock and opened the Gate of infinite curses!");
				Game.inventory.add(new Item("dagger_lock", "This is the second part, the lock of the Sacred Dagger."));
				Game.inventory.add(new Item("Devil's head", "This is the evidence of your triumph against the Devil."));
				Room c = Game.currentroom.getExit('n');
				c.setLock(false);
				Game.inventory.remove(round);
				Game.inventory.remove(Game.returnItem("shotgun"));
				Game.inventory.remove(h);
			} else {
				Game.print("You are missing something to kill that sucker.");
			}
		} else {
			Game.print("You are not in your full potential to kill it!");
		}
	}

}
