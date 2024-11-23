
public class Closet extends Item {
	public Closet(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		System.out.println("There is a picture frame in the top shelf and a mirror shard in the bottom shelf.");
		System.out.println("Do you wanna take both items: ");
		String com = Game.input.nextLine();
		if (com.toLowerCase().equals("yes")) {
			Game.inventory.add(new MirrorShard("mirror_shard", "This will help you to see the light in some dark places."));
			Game.inventory.add(new PicFrame("picture_frame", "There is a nice picture of two devils together."));
		}
	}
}
