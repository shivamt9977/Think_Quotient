package com.CollectionProgram;

import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lnklst=new LinkedList();
		lnklst.add("car");
		lnklst.add(8754);
		lnklst.add("Bike");
		lnklst.add("ergr");
		System.out.println(lnklst);
		System.out.println(lnklst.getFirst());
		System.out.println(lnklst.getLast());
		lnklst.offer("hgsdcytd");
		System.out.println(lnklst.getLast());

	}

}
