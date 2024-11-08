
public class Candle_Lamp extends Item {
	public Candle_Lamp(String name, String des) {
		super(name,des);
	}
	
	public void use() {
		Game.print("If you find a DirtBag, open it and go through it.");
	}

}
