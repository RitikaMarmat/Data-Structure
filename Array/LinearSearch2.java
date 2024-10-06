package DSA.Array;

public class LinearSearch2 {
	
	public static int linearSearch(int arr[],int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
			return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {78,99,87,54,23,1};
		int x=linearSearch(arr,54);
		if(x!=-1) {
			System.out.println("Element is at index "+x);
		}
		else {
			System.out.println("Element not found..");
		}
	}
}
