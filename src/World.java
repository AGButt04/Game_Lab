
public class World {
	public static Room buildWorld() {
		//Builds the game world
		//Returns the room where the player starts in
		System.out.println("This is where your journey begins.");
		Room graveyard = new Room("The Black Graveyard");
		Room veil = new Room("Gate of Cursed Veil");
		Room forsaken = new Room("Gate of Forsaken Path");
		Room shadows = new Room("Gate of Shadows Embrace");
		Room echo = new Room("Gate of Haunting Echo");
		Room pulse = new Room("Gate of Hidden Pulse");
		Room night = new Room("Gate of Eternal night");
		Room roots = new Room("Gate of Writhing Roots");
		Room dreams = new Room("Gate of Fractured Dreams");
		Room abyss = new Room("Gate of Hungering Abyss");
		Room chains = new Room("Gate of Eternal Chains");
		Room sorrow = new Room("Gate of Silent Sorrows");
		Room lair = new Room("The Devil's Lair");
		Room curse = new Room("The Gate of Infinite Curses.");
		
		// Just use the connections you want, can go both direction from living room but can only go living room
		// from kitchen. Updating their direction variables to the room we give them.
		// Connect the rooms to each other. Each Room has 6 directions as variables and we are putting names of rooms.
		
		graveyard.setLock(false);
		graveyard.addExit(pulse, 'e');
		graveyard.addExit(echo, 'w');
		graveyard.addExit(shadows, 'u');
		graveyard.addExit(night, 'd');
		graveyard.addItem("inscription", new Inscription("inscription", "Provides the lore about the dark past of this cursed land. Open it to read."));
		graveyard.addItem("rusty_shovel", new Item("rusty_shovel","Used to dig, but looks like it's been wielded as weapon before."));
		graveyard.addItem("Echokey", new EchoKey("Echokey", "This key will allow you to move to Gate of Haunting echo."));
		graveyard.addItem("ancient_map", new Ancient_Map("ancient_map", "This will guide to towards the hidden pathways."));
		
		veil.addExit(shadows, 'e');
		veil.addExit(sorrow, 'w');
		veil.addExit(lair, 'n');
		veil.setLock(false);
		veil.addItem("mysterious_amulet", new Mysterious_Amulet("mysterious_amulet","This will protect you in your exploration."));
		veil.addItem("tattered_cloak", new Item("tattered_cloak","It looks haunted, giving eerie warmth in the freezing cold."));
		
		pulse.addExit(graveyard,'w');
		pulse.addExit(dreams, 'd');
		pulse.setLock(false);
		pulse.addItem("safe", new Safe("safe", "This safe contains the treasure to your success!"));
		pulse.addItem("hammer", new Item("hammer", "This can help you smash some things open just for your curiousity."));
		//contains second pendulum
		
		shadows.addExit(graveyard,'d');
		shadows.addExit(veil, 'w');
		shadows.addExit(abyss, 'e');
		shadows.addNPC("puppy", new Puppy());
		shadows.setLock(false);
		
		echo.addExit(graveyard, 'e');
		echo.addExit(chains, 'u');
		echo.addItem("candle_lamp", new Candle_Lamp("candle_lamp","This will help you when you will be lost in eternal darkness."));
		echo.addItem("Dirtbag", new DirtBag("Dirtbag", "Look through this using lamp if you want."));
	
		forsaken.addExit(night, 'w');
		forsaken.addExit(dreams, 'e');
		forsaken.addItem("combination", new Combination("combination", "You have finally found one of the many key towards growth."));
		forsaken.addItem("wooden_chest", new Wooden_Chest("wooden_chest","This chest is locked and is a dummy of the original chest of curses."));
		forsaken.setLock(false);
		//contains first pendulum in wooden_chest
		
		night.addExit(graveyard, 'u');
		night.addExit(forsaken, 'e');
		night.addExit(roots, 'w');
		night.setLock(false);
		night.addItem("closet", new Closet("closet","Try to open this dirty closet if you want. I bet it's empty."));
		//contains last pendulum
		
		roots.addExit(night, 'e');
		roots.setLock(false);
		roots.addItem("chains_tip", new Item("chains_tip", "This is the first half of the key of the Gate of Writhing Roots."));
		roots.addItem("dagger_blade", new Item("dagger_blade", "This is the last part, the blade of the Sacred Dagger."));
		roots.addItem("dagger_grip", new Item("dagger_grip", "This is the first part, the grip of the Sacred Dagger."));
		roots.addItem("dagger_lock", new Item("dagger_lock", "This is the second part, the lock of the Sacred Dagger."));

		//contains chain key's half, and a pendulum
		
		dreams.addExit(forsaken, 'w');
		dreams.addExit(pulse, 'u');
		dreams.setLock(false);
		//contains chain key's other half
		dreams.addItem("chains_grip", new chainsGrip("chains_grip", "This is the second half of the key of the Gate of the Writhing Roots."));
		
		abyss.addExit(shadows, 'w');
		abyss.setLock(false);
		abyss.addNPC("Ghost", new Ghost());
		abyss.addItem("abyss_pendulum", new AbyssPendulum("abyss_pendulum", "This is the third pendulum of the four."));

		
		sorrow.addExit(veil, 'e');
		sorrow.addItem("abyss_tip", new Item("abyss_tip", "This is the first half of the key of Gate of Hungering Abyss"));
		sorrow.setLock(false);
		//contains abyss key's half
		
		chains.addExit(echo, 'd');
		chains.addItem("abyss_grip", new AbyssGrip("abyss_grip", "This is the second half of the key that will open the Gate of Hungering Abyss"));
		//contains abyss key's other half
		
		curse.addExit(lair, 's');
		
		lair.addExit(veil, 's');
		lair.addExit(curse, 'n');
		return graveyard;
		
	}
}
