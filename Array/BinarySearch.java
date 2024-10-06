package DSA.Array;

public class BinarySearch {
	
	public static int binSearch(int arr[],int element) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==element) {
				return mid;
			}
			else if(arr[mid]>element) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,4,8,45,76,89,99};
		int x=binSearch(arr,89);
		if(x!=-1) {
			System.out.println("Element is at index "+x);
		}
		else {
			System.out.println("Element not found..");
		}
	}
}
