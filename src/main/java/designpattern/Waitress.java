package designpattern;

import java.util.Iterator;
import java.util.List;

import IteratorPattern.IPrintMenu;
import IteratorPattern.Menu;
import model.MenuItem;

public class Waitress{
	private List<Menu> menusList;	
	
	public Waitress (List<Menu> menusList) {
		this.menusList=menusList;
	}
	
	public void printMenu() {
//		Iterable<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//		Iterable<MenuItem> dinerMenuIterator =dinerMenu.createIterator();
//		Iterable<MenuItem> caffeMenuIterable = cafeMenu.createIterator();
		menusList.forEach(Waitress::printMenu);
	}
	
	public static void printMenu(Menu menu) {
		/*
		 * not much sophisticated way to traverse an iterator
		 * while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.getPrice() + " -- ");

		}
		 */
		
		
		/*
		 * sophisticated way to traverse an Iterator 
		 */
		System.out.println(menu.getMENU_NAME());
	for (MenuItem menuItem: menu.createIterator()) {
		System.out.println(menuItem.getName() + ", ");
		System.out.println(menuItem.getDescription());
		System.out.println(menuItem.getPrice() + " -- ");
		
	}
		
	}
}
