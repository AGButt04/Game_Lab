
public class EchoKey extends Item {
	
	public EchoKey(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Item key = Game.returnItem("Echokey");
		Room echo = Game.currentroom.getExit('w');
		if (echo != null && echo.getName().equals("Gate of Haunting Echo") && key != null) {
			Game.print("Gate of Haunting Echo unlocked!");
			echo.setLock(false);
			Game.inventory.remove(Game.returnItem("Echokey"));
		} else {
			Game.print("Go into the appropriate room.");
		}
	}
}
