
public class Ancient_Map extends Item {
	
	public Ancient_Map(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		String s = "You have The Gate of Hidden Pulse in your east. \n"
				+ "The Gate of Haunting Echo in your west. \n"
				+ "The Gate of Shadows Embrace in upward. \n"
				+ "The Gate of Sorrow is west of Veil Gate\n"
				+ "The Gate of Veil is west of Shadows and Gate of Abyss in its east\n"
				+ "If you walk slightly downhill, You will see The Gate of Eternal Night. \n"
				+ "The Gate of Forsaken is in east and Gate of Roots is in west of Eternal night Gate"
				+ "The Gate of Dreams is in east of Gate of Forsaken\n";
				
		Game.print(s);
	}
}
