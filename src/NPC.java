import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NPC implements Serializable{
		private String name; // NPC's name
		private String desc; // NPC's description
		
		public NPC(String name, String desc) {
			this.name = name;
			this.desc = desc;
		}
		public String getName() {
			return name;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public void say(String dialog) {
			Game.print(name+": "+dialog);
		}
		public void talk() {
			Game.print("You can't talk to "+name+".");
		}
		public void response(int op) {
			// This method intentionally left blank.
		}
		
		public boolean give(ArrayList<Item> items) {
			int count = 0;
			for (Item i : items) {
				if (i != null) {
					count++ ;
				} else {
					return false;
				}
			}
			if (count == items.size()) {
				for (int i = 0; i < items.size(); i++) {
					Game.inventory.remove(items.get(i));
				}
				return true;
			}
			return false;
		}
			
		
		public void getResponse(String[] options) {
			String s = "";
			for (int i = 0; i < options.length; i++) {
				s += "Option " + (i + 1) + ": " + options[i] + "\n";
			}
			s += "Enter an option (1-" + options.length + "): ";
			int option = Integer.parseInt(JOptionPane.showInputDialog(s));
			response(option);
		}
}

