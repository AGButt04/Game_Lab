
public class World {
	public static Room buildWorld() {
		//Builds the game world
		//Returns the room where the player starts in
		System.out.println("This is where your journey begins.");
		Room graveyard = new Room("This is the Graveyard of infinite curses.");
		Room veil = new Room("This is the Gate of Cursed Veil.");
		Room forsaken = new Room("You just enter the Gate of Forsaken Path.");
		Room shadows = new Room("This place is called the Gate of Shadows Embrace.");
		Room echo = new Room("This is the Gate of Haunting Echo which is everlasting.");
		Room pulse = new Room("Do you know that you just crossed the Gate of Hidden Pulse. This is getting EXCITING!");
		Room night = new Room("You just entered eternity of DARKNESS. This is the Gate of Eternal night.");
		
		// Just use the connections you want, can go both direction from living room but can only go living room
		// from kitchen. Updating their direction variables to the room we give them.
		// Connect the rooms to each other. Each Room has 6 directions as variables and we are putting names of rooms.
		
		graveyard.addExit(pulse, 'e');
		graveyard.addExit(echo, 'w');
		graveyard.addExit(shadows, 'u');
		graveyard.addExit(night, 'd');
		graveyard.addItem("axe", new Item("Axe","You can use this to defend yourself to the incoming evils."));
		
		veil.addExit(shadows, 'e');
		veil.addItem("bottle", new Item("bottle","This bottle will help your thirst going forward."));
		veil.addItem("coat", new Item("coat","This coat will protect from the freezing cold of darkness."));
		veil.addItem("chest", new Item("chest","This chest is locked and is a dummy of the original chest of curses."));
		
		pulse.addExit(graveyard,'w');
		
		shadows.addExit(graveyard,'d');
		shadows.addExit(veil, 'w');
		
		echo.addExit(graveyard, 'e');
		echo.addItem("flashlight", new Item("flashlight","This will help you when you will be lost in eternal darkness."));
	
		forsaken.addExit(night, 'w');
		
		night.addExit(graveyard, 'u');
		night.addExit(forsaken, 'e');
		return graveyard;
		
	}
}
