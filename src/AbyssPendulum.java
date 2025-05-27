
public class AbyssPendulum extends Item {
	
	public AbyssPendulum(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Item n = Game.returnItem("night_pendulum");
		Item p = Game.returnItem("pulse_pendulum");
		Item v = Game.returnItem("veil_pendulum");
		Item a = Game.returnItem("abyss_pendulum");
		if (n != null && v != null && p != null) {
			Game.print("You have crafted the Ultimate Pendulum!");
			Game.inventory.add(new UltimatePendulum("ultimate_pendulum", "This is crafted from all four pendulums and will open the Devil's lair."));
			Game.inventory.remove(n);
			Game.inventory.remove(v);
			Game.inventory.remove(p);
			Game.inventory.remove(a);
		} else {
			Game.print("You are missing a pendulum.");
		}
	}

}
