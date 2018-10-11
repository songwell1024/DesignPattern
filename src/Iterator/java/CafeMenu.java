package Iterator.java;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu {
	private Hashtable<String,MenuItem> menuItems=new Hashtable<String,MenuItem>(); 

	public CafeMenu()
	{
		addItem("Moca Burger","moca&bruger&tomato",true,3.56f);
		addItem("Soup Latte","Latte&salad&soup",true,3.26f);
		addItem("Burrito","bacon&toamto&beans",false,3.96f);
		
	}
	private void addItem(String name, String description, boolean vegetable,
			float price) {
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		menuItems.put(name, menuItem);
		
	}
	
	
	
	public Iterator getIterator()
	{
		return menuItems.values().iterator();
	}
}
