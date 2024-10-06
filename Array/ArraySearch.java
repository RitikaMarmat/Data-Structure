package DSA.Array;

public class ArraySearch {
public static void main(String[] args) {
	int[]arr= {10,20,30,40,50,60,70};
	int element =40;
	int index=search(arr,element);
	System.out.println("index of "+ element +" : "+index);
	
	element=100;
	index=search(arr,element);
	System.out.println("index of "+ element +" : "+index);
	
}

public static int search(int[] arr, int element) {
	for(int i =0;i<arr.length;i++) {
		if(arr[i]==element) {
	      return i;
	}
	}
    return -1;

}
}
