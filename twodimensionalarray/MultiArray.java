package com.twodimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int[][] a= new int[4][4];
		System.out.println("Enter array with 4 rows and 4 columns");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = s.nextInt();
			}
	}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}	}
}
