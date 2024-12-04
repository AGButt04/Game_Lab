
public class SacredDagger extends Item {
	
	public SacredDagger(String name, String des) {
		super(name,des);
	}
	
	public void use() {
		Item heart = Game.returnItem("Sukuna's_heart");
		Item fragment = Game.returnItem("heart_fragment");
		if (heart != null && fragment != null) {
			Game.print("Congratulations, you have stabbed Sukuna's heart and lifted up the curse, saving the village!");
			Game.inventory.remove(heart);
			Game.inventory.remove(fragment);
		} else {
			Game.print("You are missing either heart or heart fragment.");
		}
	}

}
