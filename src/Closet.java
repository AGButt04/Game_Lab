import java.awt.event.ActionListener;

public class Closet extends Item {
	public Closet(String name, String des) {
		super(name, des);
	}
	
	public void open() {
		Game.print("There is a picture frame in the top shelf and a mirror shard in the bottom shelf. Both are added to your inventory.");
		Game.inventory.add(new MirrorShard("mirror_shard", "This will help you to see the light in some dark places."));
		Game.inventory.add(new PicFrame("picture_frame", "There is a nice picture of two devils together."));
		Item closet = Game.returnItem("closet");
		Game.inventory.remove(closet);
	}
}
