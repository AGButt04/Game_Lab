
public class Clock extends Item {
	
	public Clock(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Item lockpick = Game.returnItem("lockpick");
		if (lockpick != null) {
			Game.print("You have opened the clock!");
			Item hammer = Game.returnItem("hammer");
			if (hammer != null) {
				Game.print("You broke the clock and found a pendulum.");
				Game.inventory.add(new AbyssPendulum("abyss_pendulum", "This is the last pendulum of the four. Try using it after getting all four"));
				Game.inventory.remove(Game.returnItem("Clock"));
				Game.inventory.remove(lockpick);
			} else {
				Game.print("You need something to break this.");
			}
		} else {
			Game.print("You need something to open this clock lock");
		}
	}
}
