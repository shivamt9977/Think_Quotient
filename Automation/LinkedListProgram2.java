package com.CollectionProgram;

import java.util.LinkedList;

public class LinkedListProgram2 {

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
		System.out.println(lnklst.offerLast("lastbchd"));

		System.out.println(lnklst.offerFirst("sdghgvtvrej"));
		System.out.println(lnklst);
	}

}
