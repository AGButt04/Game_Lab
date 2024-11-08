
public class World {
	public static Room buildWorld() {
		//Builds the game world
		//Returns the room where the player starts in
		System.out.println("This is where your journey begins.");
		Room graveyard = new Room("The Black Graveyard", "This is the Black Graveyard of infinite curses.");
		Room veil = new Room("Gate of Cursed Veil", "This is the Gate of Cursed Veil.");
		Room forsaken = new Room("Gate of Forsaken Path", "You just enter the Gate of Forsaken Path.");
		Room shadows = new Room("Gate of Shadows Embrace", "This place is called the Gate of Shadows Embrace.");
		Room echo = new Room("Gate of Haunting Echo", "This is the Gate of Haunting Echo which is everlasting.");
		Room pulse = new Room("Gate of Hidden Pulse", "Do you know that you just crossed the Gate of Hidden Pulse. This is getting EXCITING!");
		Room night = new Room("Gate of Eternal night", "You just entered eternity of DARKNESS. This is the Gate of Eternal night.");
		
		// Just use the connections you want, can go both direction from living room but can only go living room
		// from kitchen. Updating their direction variables to the room we give them.
		// Connect the rooms to each other. Each Room has 6 directions as variables and we are putting names of rooms.
		
		graveyard.setLock(false);
		graveyard.addExit(pulse, 'e');
		graveyard.addExit(echo, 'w');
		graveyard.addExit(shadows, 'u');
		graveyard.addExit(night, 'd');
		graveyard.addItem("inscription", new Inscription("inscription", "Provides the lore about the dark past of this cursed land. Open it to read."));
		graveyard.addItem("Rusty_shovel", new Item("Rusty_shovel","Used to dig, but looks like it's been wielded as weapon before."));
		graveyard.addItem("Echokey", new EchoKey("Echokey", "This key will allow you to move to Gate of Haunting echo."));
		graveyard.addItem("ancient_map", new Ancient_Map("ancient_map", "This will guide to towards the hidden pathways."));
		
		veil.addExit(shadows, 'e');
		veil.addItem("mysterious_amulet", new Mysterious_Amulet("mysterious_amulet","This will protect you in your exploration."));
		veil.addItem("tattered_cloak", new Item("tattered_cloak","It looks haunted, giving eerie warmth in the freezing cold."));
		veil.addItem("wooden_chest", new Wooden_Chest("wooden_chest","This chest is locked and is a dummy of the original chest of curses."));
		
		pulse.addExit(graveyard,'w');
		pulse.addItem("safe", new Safe("safe", "This safe contains the treasure to your success!"));
		
		shadows.addExit(graveyard,'d');
		shadows.addExit(veil, 'w');
		shadows.setLock(false);
		
		echo.addExit(graveyard, 'e');
		echo.addItem("candle_lamp", new Candle_Lamp("candle_lamp","This will help you when you will be lost in eternal darkness."));
		echo.addItem("Dirtbag", new DirtBag("Dirtbag", "Look through this using lamp if you want."));
	
		forsaken.addExit(night, 'w');
		forsaken.addItem("combination", new Combination("combination", "You have finally found one of the many key towards growth."));
		
		night.addExit(graveyard, 'u');
		night.addExit(forsaken, 'e');
		return graveyard;
		
	}
}
