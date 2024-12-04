
public class MirrorShard extends Item {
	
	public MirrorShard(String name, String des) {
		super(name, des);
	}
	
	public void use() {
		Item mirror = Game.returnItem("mirror_shard");
		Item torch = Game.returnItem("torch");
		if (torch != null) {
			Game.print("The combination to the safe is in Gate of Forsaken Path. Just get to the room and write 'take combination.' ");
			Game.print("You will find the last bullet piece in the room which grows. Look closely!");
			Game.print("You can see this only once so memorize or write it down.");
			Game.inventory.remove(mirror);
			Game.inventory.remove(torch);
		} else {
			Game.print("You cannot see the reflection properly.");
		}
	}
}
