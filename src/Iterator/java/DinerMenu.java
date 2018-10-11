package Iterator.java;

import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenu {
	private final static int Max_Items = 5;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[Max_Items];
		addItem("vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
		addItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
		addItem("bean soup", "bean&potato salad", true, 3.28f);
		addItem("hotdog", "onions&cheese&bread", false, 3.05f);

	}

	private void addItem(String name, String description, boolean vegetable,
			float price) {
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		if (numberOfItems >= Max_Items) {
			System.err.println("sorry,menu is full!can not add another item");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}

	}

	public Iterator getIterator() {
		return new DinerIterator();
	}

	class DinerIterator implements Iterator {
		private int position = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (position < numberOfItems) {
				return true;
			}
			position = 0;
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			MenuItem menuItem = menuItems[position];
			position++;
			return menuItem;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}
}
