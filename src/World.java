
public class World {
	public static Room buildWorld() {
		//Builds the game world
		//Returns the room where the player starts in
		Game.print("This is where your journey begins. The directions are 'n,s,e,w,u,d'. "
				+ "If you try to take something, write the word exactly as it is written in the room description.");
		Game.print("Your commands are 'use' (item), 'open' (item), 'take' (item) before using and opening, 'location' to print your current room.");
		Game.print("'save' to save game, 'load' to load game, 'i' to check your inventory, and 'look' to see the item's description.\n");
		Room graveyard = new Room("The Black Graveyard");
		Room veil = new Room("Gate of Cursed Veil");
		Room forsaken = new Room("Gate of Forsaken Path");
		Room shadows = new Room("Gate of Shadows Embrace");
		Room pulse = new Room("Gate of Hidden Pulse");
		Room echo = new Room("Gate of Haunting Echo");
		Room night = new Room("Gate of Eternal night");
		Room roots = new Room("Gate of Writhing Roots");
		Room dreams = new Room("Gate of Fractured Dreams");
		Room abyss = new Room("Gate of Hungering Abyss");
		Room chains = new Room("Gate of Eternal Chains");
		Room sorrow = new Room("Gate of Silent Sorrows");
		Room lair = new Room("The Devil's Lair");
		Room curse = new Room("The Gate of Infinite Curses");
		
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
		graveyard.addItem("Echokey", new EchoKey("Echokey", "This key will allow you to move to Gate of Haunting echo.")); // Use in graveyard to unlock the gate.
		graveyard.addItem("ancient_map", new Ancient_Map("ancient_map", "This will guide to towards the hidden pathways.")); //For Directions
		
		echo.addExit(graveyard, 'e');
		echo.addExit(chains, 'u');
		echo.addItem("candle_lamp", new Candle_Lamp("candle_lamp","This will help you when you will be lost in eternal darkness.")); //required to open Dirtbag
		echo.addItem("Dirtbag", new DirtBag("Dirtbag", "Look through this using lamp if you want.")); //Got veil key, and lockpick

		shadows.addExit(graveyard,'d');
		shadows.addExit(veil, 'w');
		shadows.addExit(abyss, 'e');
		shadows.addNPC("puppy", new Puppy());
		shadows.addItem("hydrogen", new Item("hydrogen", "Use to make acid."));
		shadows.addItem("sulphur", new Item("sulphur","Use to make acid."));
		shadows.setLock(false);
		
		veil.addExit(shadows, 'e');
		veil.addExit(sorrow, 'w');
		veil.addExit(lair, 'n');
		veil.addItem("sulphur", new Item("sulphur", "This will make up an acid when dissolved with oxygen."));
		veil.addItem("torch", new Item("torch", "This can only be used once to reflect some light.")); //Need it to use mirror_shard
		veil.addItem("mysterious_amulet", new Mysterious_Amulet("mysterious_amulet","This will help you in your exploration.")); //use it in graveyard, opens night and pulse
		veil.addItem("tattered_cloak", new Item("tattered_cloak","It looks haunted, giving eerie warmth in the freezing cold."));
		
		pulse.addExit(graveyard,'w');
		pulse.addExit(dreams, 'd');
		pulse.addItem("safe", new Safe("safe", "This safe contains the treasure to your success!")); //Got diamond and pulse pendulum
		pulse.addItem("hammer", new Item("hammer", "This can help you smash some things open just for your curiousity."));
		pulse.addItem("hydrogen", new Item("hydrogen","This will help in acid making"));
		//contains second pendulum

		night.addExit(graveyard, 'u');
		night.addExit(forsaken, 'e');
		night.addExit(roots, 'w');
		night.addItem("oxygen", new Oxygen("oxygen", "Final component to make Sulphuric Acid.")); //combined with sulphur and hydrogen to make acid
		night.addItem("closet", new Closet("closet","Try to open this dirty closet if you want. I bet it's empty.")); //contains mirror_shard and frame.
		//frame contains pendulum
		//frame needs hammer to break it.

		forsaken.addExit(night, 'w');
		forsaken.addExit(dreams, 'e');
		forsaken.addItem("combination", new Combination("combination", "You have finally found one of the many key towards growth.")); // to open safe
		forsaken.addItem("wooden_chest", new Wooden_Chest("wooden_chest","This chest (locked) is a dummy of the original chest of curses.")); //veil pendulum, gold_plate
		forsaken.setLock(false);
		//contains first pendulum in wooden_chest
				
		dreams.addExit(forsaken, 'w');
		dreams.addExit(pulse, 'u');
		dreams.setLock(false);
		dreams.addItem("oxygen", new Oxygen("oxygen", "Final component to make Sulphuric Acid.")); //same acid
		dreams.addItem("cage", new Cage("cage", "Looks like something inside the cage, requires opening")); //Got chain's tip roots.addExit(night, 'e');
		
		roots.addExit(night, 'e');
		roots.setLock(false);
		roots.addItem("bushes", new Bushes("bushes", "Dissolve these bushes or cut them clean to find something beneath.")); //Got chain's grip and casing
		roots.addItem("lockpick", new Item("lockpick", "This can help you open somethings.")); //can open things.
		
		sorrow.addExit(veil, 'e');
		sorrow.addItem("Portrait", new Portrait("Portrait", "This looks like a Portarit of a cursed entity.")); //Needs knife to open, got abyss tip
		sorrow.addItem("statue", new Statue("statue", "This statue looks like of Sukuna")); // needs hammer, knife, and rusty_shovel to break, got dagger blade
		sorrow.setLock(false);
		//contains abyss key's half
		
		chains.addExit(echo, 'd');
		chains.addItem("steel_box", new SteelBox("steel_box", "This box is locked and requires lock breaking.")); //got abyss grip and hammer
		chains.addItem("rustysword", new RustySword("rustysword", "This sword is good for nothing now.")); //needs hammer to break, got knife and dagger's grip
		//contains abyss key's other half
		
		abyss.addExit(shadows, 'w');
		abyss.addNPC("Ghost", new Ghost()); //Talk with ghost to know the placement of ultimate_pendulum, make shotgun, and sacred dagger.
		//Devil will give you two parts and you need casing to make a deadly_round to kill the devil.
		abyss.addItem("Vase", new Vase("Vase", "Looks like just dust in it.")); //Got heart fragment
		abyss.addItem("Clock", new Clock("Clock", "This Pendulum Clock works but tells the wrong time.")); // Needs lockpick and hammer to open, got abyss pendulum.
		
		lair.addExit(veil, 's');
		lair.addExit(curse, 'n');
		lair.addItem("health", new Item("health", "You will need this health bar before fighting the devil.")); //contains devil which will be killed by shotgun

		curse.addExit(lair, 's');
		curse.addItem("Gold_Cursed_Chest", new GoldChest("Gold_Cursed_Chest", "This chest is locked and posses the heart of the devil.")); //contains heart
		//Golden chest of curses, locked with a combination 43511.
		
		return graveyard;		
	}
}
