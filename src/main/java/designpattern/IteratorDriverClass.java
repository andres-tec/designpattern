package designpattern;

import java.util.ArrayList;
import java.util.List;

import IteratorPattern.CafeMenu;
import IteratorPattern.DinerMenu;
import IteratorPattern.Menu;
import IteratorPattern.PancakeHouseMenu;

public class IteratorDriverClass {
	
	public static void main (String[] args){
		System.out.println("Test drive Iterator pattern!!");
		Menu pancakeHouseMenu= new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafMenu = new CafeMenu();
		List<Menu> menusList = new ArrayList<Menu>();
		
		menusList.add(pancakeHouseMenu);
		menusList.add(dinerMenu);
		menusList.add(cafMenu);
		
		Waitress waitress = new Waitress(menusList);
		waitress.printMenu();
	}

}
