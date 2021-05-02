package com.obydul.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {
	public static void main(String[] args) {
		ArrayList l = new ArrayList(Arrays.asList(args));
		Enumeration enumeration = new IteratorEnumeration(l.iterator());
		System.out.println("Iterator Enumeration");
		while (enumeration.hasMoreElements()) {
			System.out.println("test = "+enumeration.nextElement());
		}
	}

}
