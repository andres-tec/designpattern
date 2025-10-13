package compositepattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{
	private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String nameString; 
	private String descriptionString;
	
	public Menu(String nameString, String descriptionString) {
		this.nameString = nameString;
		this.descriptionString = descriptionString;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return menuComponents.get(i);
	}

	@Override
	public String getName() {
		return nameString;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return descriptionString;
	}

	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("--------------------");
		
		for (MenuComponent menuComponent: menuComponents) {
			menuComponent.print();	
		}
	}

}
