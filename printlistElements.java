package com.javaassignment1.in;

import java.util.ArrayList;


public class printlistElements {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList <>();
	 	
		colors .add("Red ");
		colors .add("Yellow  ");
		colors .add("Blue ");
		colors .add("Green ");
		colors .add("Orange ");
		colors .add("Purple");
		
		System.out.println("Befor :");
		
		for(int i = 0 ; i<colors.size();i++)
		System.out.println("Element at index"+ i +":" +colors.get(i));
		}

}
