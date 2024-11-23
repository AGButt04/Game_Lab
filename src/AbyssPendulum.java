
public class AbyssPendulum extends Item {
	
	public AbyssPendulum(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		int count = 0;
		for (Item i : Game.inventory) {
			if (i.getItname().equals("night_pendulum"))
				count++;
			if (i.getItname().equals("veil_pendulum"))
				count++;
			if (i.getItname().equals("pulse_pendulum"))
				count++;
		}
		
		if (count == 3) {
			System.out.println("You have crafted the Ultimate Pendulum! Try using it in the appropriate room (North).");
			Game.inventory.add(new UltimatePendulum("ultimate_pendulum", "This is crafted from all four pendulums and will open the Devil's lair."));
			Item n = Game.returnItem("night_pendulum");
			Item v = Game.returnItem("veil_pendulum");
			Item p = Game.returnItem("pulse_pendulum");
			Item a = Game.returnItem("abyss_pendulum");
			Game.inventory.remove(n);
			Game.inventory.remove(v);
			Game.inventory.remove(p);
			Game.inventory.remove(a);
		}
	}

}
