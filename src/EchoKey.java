
public class EchoKey extends Item {
	
	public EchoKey(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Room echo = Game.currentroom.getExit('w');
		if (echo.getName().equals("Gate of Haunting Echo")) {
			Game.print("Gate of Haunting Echo unlocked!");
			echo.setLock(false);
		}
	}

}
