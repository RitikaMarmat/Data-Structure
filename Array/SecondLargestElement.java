package DSA.Array;

import java.util.Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[]arr= {50,90,10,15,85,60};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}	
}
