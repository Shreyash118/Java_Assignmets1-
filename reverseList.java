package com.javaassignment1.in;

import java.util.ArrayList;
import java.util.Collections;

public class reverseList {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList <>();
	 	
		colors .add("Red ");
		colors .add("Yellow  ");
		colors .add("Blue ");
		colors .add("Green ");
		colors .add("Orange ");
		colors .add("Purple");
		
		System.out.println("Befor :"+colors);
		
		Collections.reverse(colors);
		System.out.println("Reversed :" +colors);
		}

}
