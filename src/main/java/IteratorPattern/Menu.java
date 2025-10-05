package IteratorPattern;

import java.util.Iterator;

import model.MenuItem;

public interface Menu {
//	void addItem(MenuItem menuItem);
	public String getMENU_NAME();
	Iterable<MenuItem> createIterator();
	
}
