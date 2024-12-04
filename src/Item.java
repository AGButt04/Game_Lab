import java.io.Serializable;

public class Item implements Serializable{
	
	private String itname;
	private String description;
	
	public Item(String n, String des) {
		itname = n;
		description = des;
	}
	
	public void take() {
		Game.print(itname + " is added to your inventory!\n");
		Game.inventory.add(this);
		Game.currentroom.removeItem(itname);
	}
	public String getItname() {
		return itname;
	}
	
	public String getDes() {
		return description;
	}
	
	public void setItname(String name) {
		itname = name;
	}
	
	public void setDes(String d) {
		description = d;
	}
	
	public void open() {
		Game.print("You can't open that!");
	}
	
	public void use() {
		Game.print("You can't use that!");
	}
	
	public String toString() {
		String s = "The item(s) in your inventory: " + itname + ".";
		return s;
	}
	
}
