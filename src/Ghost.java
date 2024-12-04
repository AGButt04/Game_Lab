
public class Ghost extends NPC{
	
	public Ghost() {
		super("Ghost", "The keeper of the curses roams in the room of the Abyss.");
	}
	
	int count = 1;
	
	@Override
	public void talk() {
		if (count == 1) {
			say("I am the Wandering Ghost who's the keeper of the curses. "
					+ "Once, I was like you. Foolish, hopeful, determined. I thought I could save them. "
					+ "Instead, I became this… a warden of despair.");
			String [] options = {
				"What happened to you?",
				"I need to know where to use this Ultimate Pendulum, Will you help me?"
			};
			getResponse(options);
			count++ ;
		} else if (count == 2) {
			say("Why are you back with your cheap ass? Looking for something?");
			String[] op = {
				"Yes, I want to know how to kill that devil. Make me something for it.",
				"This game is bullshit!"
			};
			getResponse(op);
			count++ ;
		} else if (count == 3) {
			say("Are you back with the items I asked you to bring?");
			String[] ops = {
				"Yes, I have the items you need. Now, hurry up and do something! ",
				"No! F**k this man, I ain't doing shit!"
			};
			getResponse(ops);
			count++ ;
		} else {
			say("You dare show your face again?! What is it that you need this time?");
			String[] options = {
				"I need you to forge this Sacred Dagger for me. I have all the parts.",
				"I am injured, please put me out of my misery."
			};
			getResponse(options);
		}
	}
	@Override
	public void response(int option) {
		if (count == 1) {
			Item d;
			switch(option) {
			case 1:
				say("I also came to kill the king of curses, and stab its heart like you but that motherfucker killed me instead! Bummer man");
				break;
			case 2:
				say("There is a diamond somewhere in the village. I'd like to have that before I answer that question. Do you have it?");
				Game.print("Do you want to give him the diamond? yes or no?");
				String ans = Game.input.nextLine();
				if (ans.equals("yes")) {
					d = Game.returnItem("diamond");
					if (Game.inventory.contains(d)) {
						Game.inventory.remove(d);
						say("Thank you. If I remember correctly, I placed it around the Gate of Silent Sorrows.");	
					} else {
						say("You don't got no dimaond. Get out! Lying bastard!");
					}
				} else {
					say("Alright, get out with your cheap ass diamond.");
				}
				break;
			}
		} else if (count == 2) {
			switch(option) {
			case 1:
				say("There is a sword I can forge for you but I need some items: "
						+ "Gold plate, Hammer, Rusty shovel, and that dimaond that I asked your sorry ass before. Don't come back until you have these.");
				Game.print("The Ghost kicked your ass outta the Gate of Abyss. So embarrasing.");
				break;
			case 2:
				say("You telling me man! My ass is dead already, now run before you die too bruh!");
				break;
			}
		} else if (count == 3) {
			switch(option) {
			case 1:
				say("Okay, I did not expect that but a'ight!");
				Item plate = Game.returnItem("gold_plate");
				Item hammer = Game.returnItem("hammer");
				Item rusty = Game.returnItem("rusty_shovel");
				Item dia = Game.returnItem("diamond");
				if (Game.inventory.contains(dia)) {
					Game.inventory.remove(dia);
				}
				if (plate != null && hammer != null && rusty != null) {
					Game.inventory.remove(plate);
					Game.inventory.remove(rusty);
					Game.inventory.remove(hammer);
					Game.inventory.add(new Shotgun("shotgun", "This gun will help you kill the devil in Devil's lair."));
					Game.inventory.add(new Item("bullet", "Bullet (part) for the shotgun's round."));
					Game.inventory.add(new Item("gunpowder", "Gun powder for the shotgun's round."));
					say("I didn't make no sword cuz I was tired but here is the Shotgun and two parts for you. "
							+ "Find the bullet casing, use it and make up a large round to kill that sucker!");
				} else {
					Game.print("You do not have all the items! I checked your inventory f**ker, stop lying and go and get all the things.");
				}

				break;
			case 2:
				say("Man, F**k you man! If I see your coward ass again, I gonna kill you! I didn't even whine that much that you doing. DAMN!");
				break;
			}	
		} else {
			switch(option) {
			case 1:
				say("Ah Shit! Here we go again. Hand over everything.");
				Game.print("Do you wish to give him everything? yes or no?");
				String a = Game.input.nextLine();
				if (a.equals("yes")) {
					Item grip = Game.returnItem("dagger_grip");
					Item lock = Game.returnItem("dagger_lock");
					Item blade = Game.returnItem("dagger_blade");
					if (grip != null && lock != null && blade != null) {
						Game.inventory.remove(grip);
						Game.inventory.remove(lock);
						Game.inventory.remove(blade);
						Game.inventory.add(new SacredDagger("Sacred_Dagger", "This is the most important thing to kill the curse."));
						say("Congratulions, Final battle awaits!");						
					} else {
						Game.print("You're missing the items man! Stop playing with me cheap ass liar.");
					}

				} else {
					say("Motherfucker, stop playing with me! I'm finna kill your ass.");
				}
				break;
			case 2:
				say("Just type 'x' man, I look like a excutioner to you, don't try to put your blood on my hands sucker!");
				break;
			}
		}
	}
}
