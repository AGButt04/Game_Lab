
public class SacredDagger extends Item {
	
	public SacredDagger(String name, String des) {
		super(name,des);
	}
	
	public void use() {
		Item heart = Game.returnItem("Sukuna's_heart");
		Item fragment = Game.returnItem("heart_fragment");
		if (heart != null && fragment != null) {
			Game.print("\nCongratulations, you have stabbed Sukuna's heart and lifted up the curse, saving the village!");
			Game.print("The Game is over here, now you can wander around or close it.");
			Game.inventory.remove(heart);
			Game.inventory.remove(fragment);
		} else {
			Game.print("You are missing either heart or heart fragment.");
		}
	}

}
