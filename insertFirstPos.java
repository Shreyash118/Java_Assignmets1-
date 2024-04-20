package com.javaassignment1.in;

import java.util.ArrayList;

public class insertFirstPos {
public static void main(String[] args) {
	ArrayList<String > list = new ArrayList<String>();
	
	list.add("Red ");
	list.add("Blue ");
	list.add("Greee ");
	list.add("Yellow ");
	
	System.out.println("Before : "+ list);
	
	list.add(0,"orange ");
	
	System.out.println("After :"+ list);
}
}
