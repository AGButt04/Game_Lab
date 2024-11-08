
public class Ancient_Map extends Item {
	
	public Ancient_Map(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		String s = "You have The Gate of Hidden Pulse in your east. \n"
				+ "The Gate of Haunting Echo in your west. \n"
				+ "If you walk slightly downhill, You will see The Gate of Eternal Night. \n"
				+ "The Gate of Shadows Embrace in upward. \n";
		System.out.println(s);
	}

}
