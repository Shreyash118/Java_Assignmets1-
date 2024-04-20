package com.javaassignment1.in;

import java.util.LinkedList;
import java.util.Scanner;

public class insertAtPos {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LinkedList<String> colors = new LinkedList <>();
	 	
		colors .add("Red ");
		colors .add("Yellow  ");
		colors .add("Blue ");
		colors .add("Green ");
		colors .add("Orange ");
		colors .add("Purple");
		
		System.out.println("Befor :"+colors);
		String s= sc.nextLine();
		int pos= 3;
	if (pos >=0 && pos <= colors.size()) {
		colors.add(s);
		System.out.println("After Inserting :" +colors );
	}else {
		System.out.println("Invalid pos ");
		}
}
}