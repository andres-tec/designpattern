package IteratorPattern;

import java.util.Iterator;
import java.util.List;

import model.DinerMenuIterator;
import model.MenuItem;

public class DinerMenu implements Menu{
	private final String MENU_NAME ="\nLUNCH";
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT",
				"(Faking)Bacon with lettuce & tomato on whole wheat",
				false, 2.99);
		addItem("BLT",
				"Bacon with lettuce & tomato on whole wheat",
				false, 2.99);
		addItem("soup of the day ",
				"soup of the day with a side potato salad",
				false, 3.29);
		addItem("Hotdog",
				"A hotdog with sauerkraut, relish, onions, topped with cheese",
				false, 3.05);
	}
	
	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full! Can't add to menu" );
		}else {
			menuItems[numberOfItems]= menuItem;
			numberOfItems = numberOfItems + 1;
			
		}
	}
	public Iterable<MenuItem> createIterator(){
		return new DinerMenuIterator(menuItems);
	}

	public String getMENU_NAME() {
		return MENU_NAME;
	}
	
}
