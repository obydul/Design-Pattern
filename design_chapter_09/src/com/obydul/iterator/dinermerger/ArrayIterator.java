package com.obydul.iterator.dinermerger;

import java.util.Iterator;

public class ArrayIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	public ArrayIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

}
