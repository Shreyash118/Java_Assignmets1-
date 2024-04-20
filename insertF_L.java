package com.javaassignment1.in;

import java.util.LinkedList;
import java.util.Scanner;

public class insertF_L {
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
		colors.addFirst(s);
		System.out.println("After :" +colors);
		
		String b= sc.nextLine();
		colors.addLast(b);
		System.out.println("After :" +colors);
		}
}
