import java.util.HashMap;

public class Room {
	// Object-variables -- usually private
	private String location; //Room description displayed to the player
	// Object references to other Room objects -- null by default
	private Room east; //Reference to room to the east of this room
	private Room west; //Reference to room to the west of this room
	private Room north;
	private Room south;
	private Room up;
	private Room down;
	private HashMap<String, Item> items = new HashMap<String, Item> ();
	private boolean lock;
	private String name;
	
	// Constructor method - initializes object variables
	// Does not initialize Room variables because they default to null
	// which is what we want
	public Room(String n, String des) { //Room's description
		name = n;
		location = des;
		lock = true;
	}
	
	// Object methods
	// This method just returns the room where you will go if you move in the desired direction.
	
	public boolean checkExit(Room room,char dir) {
		if (room.getExit(dir) == null) {
			return false;
		} else {
			return true;
		}
	}
	public Room getExit(char dir) {
		if (dir == 'e') { //As long as there is only one line, you don't need curly braces.
			return east;
		} else if (dir == 'w') {
			return west;
		} else if (dir == 's') {
			return south;
		} else if (dir == 'n') {
			return north;
		} else if (dir == 'u') {
			return up;
		} else if (dir == 'd') {
			return down;
		} else {
			return null;
		}
	}
	
	// Updates on the Room variables.
	// The character "dir" identifies which variable to update.
	// Update the variable to refer to the room "name".
	public void addExit(Room name, char dir) {
		if (dir == 'e') {
			east = name;
		} else if (dir == 'w') {
			west = name;
		} else if (dir == 's') {
			south = name;
		} else if (dir == 'n') {
			north = name;
		} else if (dir == 'u') {
			up = name;
		} else if (dir == 'd') {
			down = name;
		}
	}
	
	public void addItem(String name, Item item) {
		items.put(name, item);
	}
	
	public Item getItem(String Itname) {
		return items.get(Itname);
	}
	
	public void removeItem(String name) {
		items.remove(name);
	}
	
	public String getItemN(Item item) {
		return item.getItname();
	}
	public void setItemN(String Iname, String Nname) {
		Item it = items.get(Iname);
		it.setItname(Nname);
	}
	
	public void setItemD(String d, String name) {
		Item it = items.get(name);
		it.setDes(d);
	}
	
	public boolean getLock() {
		return lock;
	}
	
	public void setLock(boolean b) {
		lock = b;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String na) {
		name = na;
	}
	
	// Formats object data into a string.
	// Returns that string.
	public String toString() {
		return location;
	}
	
}
