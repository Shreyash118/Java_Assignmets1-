package com.javaassignment1.in;

import java.util.ArrayList;
import java.util.Scanner;

public class retriveElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String > list = new ArrayList<>();
	

	list.add("Red ");
	list.add("Blue ");
	list.add("Greee ");
	list.add("Yellow ");
	
	int i = sc.nextInt();
	
	if (i>=0 && i< list.size()) {
		String s = list.get(i);
		System.out.println("Element :"+ i + " : "+s);
	}else {
		System.out.println("Invalid index");
	}
	
}
}
