package com.CollectionProgram;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s=new Stack();
		s.add("mhasgd");
		s.add(387465);
		s.add("jshjdgvfv");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.push("pushing"));

		System.out.println(s);
		System.out.println(s.peek());

		System.out.println(s.search("vsvsvsvs"));
		System.out.println(s.search("pushing"));

	}

}
