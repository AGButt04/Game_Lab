
public class Clock extends Item {
	
	public Clock(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item lockpick = Game.returnItem("lockpick");
		if (lockpick != null) {
			Game.print("You have opened the clock. Do you wanna break it? yes or no?");
			String c = Game.input.nextLine();
			if (c.equals("yes")) {
				Item hammer = Game.returnItem("hammer");
				if (hammer != null) {
					Game.print("You broke the clock and found a pendulum.");
					Game.inventory.add(new AbyssPendulum("abyss_pendulum", "This is the third pendulum of the four."));
					Game.inventory.remove(Game.returnItem("Clock"));
					Game.inventory.remove(lockpick);
				} else {
					Game.print("You need something to break this.");
				}
			} else {
				Game.print("As you wish.");
			}
		} else {
			Game.print("You need something to open this clock lock");
		}
	}
}
