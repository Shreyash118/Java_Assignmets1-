package com.javaassignment1.in;

import java.util.Scanner;

public class hollowTriangle {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        for(int i=0; i<=n; i++){
	            for(int j=0; j<n-i; j++){
	                System.out.print(" ");
	            }
	            
	            for(int j=0; j<2*i-1; j++){
	                if(j == 0 || j == 2*i-2){
	                    System.out.print("*");
	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        for(int i=0; i<3*n; i++){
	            System.out.print("*");
	       }
	}
}

