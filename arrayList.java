package com.javaassignment1.in;

import java.util.ArrayList;

public class arrayList {
public static void main(String[] args) {
	ArrayList<String> colors = new ArrayList <>();
 	
	colors .add("Red ,");
	colors .add("Yellow , ");
	colors .add("Blue ,");
	colors .add("Green ,");
	colors .add("Orange ,");
	colors .add("Purple");
	
	System.out.print("Colours :");
	for (String color: colors) {
		System.out.print(color);
	}
}
}
