package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Matrix size: ");
		System.out.print("Lines: ");
		int m = sc.nextInt();
		System.out.print("Columns: ");
		int n = sc.nextInt();
		System.out.println();
		int[][] mat = new int[m][n];
		
		System.out.println("Matrix data: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Choose the data: ");
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length;i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Line position: " + i + ", column " + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
				
		sc.close();

	}

}
