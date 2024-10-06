package DSA.Array;

import java.util.Scanner;

public class Array5 {
public static void main(String[] args) {
	int[][] arr= new int[4][5];
	Scanner kb = new Scanner(System.in);
	for(int i=0;i<4;i++) {
		for(int j=0;j<5;j++) {
			arr[i][j]=kb.nextInt();
		}
	}
	for(int i=0;i<4;i++) {
		for(int j=0;j<5;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
		}
}
}
