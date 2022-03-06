package Assisted_Practice_project;

import java.util.Scanner;

// Single Dimensional and MultiDimensional
public class Arrays {

	public static void main(String[] args) {
		//Single Dimensional Array
		System.out.println("Single Dimensional Array");
		int[] single ;  // Array Declaration 
		single = new int[5];  // Array creation
		for(int i= 0;i<5;i++) {
			single[i] = new Scanner(System.in).nextInt();
			System.out.println("Elements of Array :"+single[i]);
		}
		//Single dimensional Array another method
		System.out.println("\nsingle dimensional Array another method \n");
		int[] single1 = {1,2,3,4,5};
		for(int i=0;i<single1.length;i++) {
			System.out.println("Elements of Array :"+single1[i]);
		}
		
		//MultiDimensional Array
		System.out.println("\nMultiDimensional Array\n");
		int[][] multi = {{1,2,3,4,5},{5,4,3,2,1}};
		for(int i=0;i<multi.length;i++) {
			for(int j=0;j<multi[i].length;j++) {
				System.out.println("Elements of Multidimentional array :"+multi[i][j]);
			}
		}
		System.out.println("\nLength of Row 1:"+multi[0].length);

	}

}
