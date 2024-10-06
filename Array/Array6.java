package DSA.Array;

import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int row=kb.nextInt();
		System.out.println("Enter no of cols : ");
		int col=kb.nextInt();
		int [][]arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter value of arr["+i+"]["+j+"] : ");
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.println("Array is : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}
	}
}
