package IteratorPattern;

import java.util.HashMap;
import java.util.Map;

import model.MenuItem;

public class CafeMenu implements Menu {
	private final String MENU_NAME ="\n DINNER";
	Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

	public CafeMenu() {
		addItem("Soup of the day", "A cup of the soup of the day, with a side salad", true, 3.69);
		addItem("Burrito", "A large Burrito, with whole pinto beans", false, 4.29);
		addItem("Veggie Burger and air fries", "Veggie burger on a whole wheat bun, lettuce, tomato and fries", false, 3.99);
	}
	public void addItem(String name, String descripcion, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, descripcion, vegetarian, price);
		menuItems.put(name, menuItem);
	}
	
	@Override
	public Iterable<MenuItem> createIterator() {
		return menuItems.values();
	}
	
	public String getMENU_NAME() {
		return MENU_NAME;
	}

}
