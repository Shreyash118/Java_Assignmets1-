package com.javaassignment1.in;


import java.util.LinkedList;

public class printAllElements_LL {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList <>();
	 	
		colors .add("Red ");
		colors .add("Yellow  ");
		colors .add("Blue ");
		colors .add("Green ");
		colors .add("Orange ");
		colors .add("Purple");
		
		System.out.println("Befor :");
		
		for(int i = 0 ; i<colors.size();i++)
		System.out.println("Element at index "+ i +":" +colors.get(i));
}
}