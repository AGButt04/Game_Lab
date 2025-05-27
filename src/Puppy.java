
public class Puppy extends NPC{
	
	public Puppy() {
		super("puppy", "A hideous puppy wags his tail.");
	}
	
	int count = 1;
	@Override
	public void talk() {
		if (count == 1) {
			say("Hi! I'm an adorable puppy!");
			String[] options = {
			"Yes you are! Who's a good boy?",
			"Ew, no. You're actually kinda hideous."
			};
			getResponse(options);						
			count++;

		} else if (count == 2) {
			say("Hey! Wanna play fetch? say yes! say yes!");
			String[] option = {
				"Yes. I love fetch!",
				"No, I don't like to play with puppies because I am a horrible person."
			};
			getResponse(option);
			count++;
		} else {
			say("Why are you back?");
			String[] op = {
				"I would like to play fetch again",
				"I wanted to apologize for my behaviour."
			};
			count++;
			getResponse(op);
		}
		
	}
	@Override
	public void response(int option) {
		if (count == 1) {
			switch(option) {
				case 1:
					say("I am! I'm a good boy!");
					break;
				case 2:
					say("I am adorable! Why are you so mean?");
					Game.print("The puppy bites you. You deserve it.");
					break;
			}
		} else if (count == 2) {
			switch(option) {
				case 1:
					say("Yay! Fetch!");
					Game.print("The puppy runs off and returns with a ball. The player gets the ball.");
					break;
				case 2:
					say("You are a horrible person! I don't like you!");
					Game.print("The puppy runs away and doesn't come back.");
					break;
			}
		} else {
			switch(option) {
				case 1:
					say("Yipay!"); 
					Game.print("The puppy went away waging its tail, being disgusted with you.");
					break;
				case 2:
					say("Apology accepted.");
					Game.print("The puppy says get the f**k off now!");
					break;
			}
		}
	}
}
