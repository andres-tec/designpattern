package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.MenuItem;

public class PancakeHouseMenu implements Menu {
	private final String MENU_NAME ="\nBREAKFAST";
	List<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("K&B's pancake breakfast","Pancakes with scrambled eggs and toast",true, 2.99);
		addItem("regular pancake breakfast","Pancakes with fried eggs, sausage",false, 2.99);
		addItem("Blueberry pancakes","Pancakes made with fresh blueberries",true, 3.49);
		addItem("Waffles","waffles with your choice of blueberries or strawberries",true, 3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterable<MenuItem> createIterator(){
		return menuItems;
	}

	public String getMENU_NAME() {
		return MENU_NAME;
	}
	
}
