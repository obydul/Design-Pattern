package com.obydul.iterator.dinermerger;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator {
	MenuItem[] list;
	int position;

	public AlternatingDinerMenuIterator(MenuItem[] list) {
		this.list = list;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.DAY_OF_WEEK % 2;
	}

	@Override
	public Object next() {
		MenuItem menuItem = list[position];
		position = position + 2;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Alternating Diner Menu Iterator";
	}

}
