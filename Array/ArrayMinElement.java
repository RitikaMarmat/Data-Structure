package DSA.Array;

public class ArrayMinElement {
	public static void main(String[] args) {
		int[]arr= {50,90,10,15,85,60};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)	{
				min=arr[i];
			}
		}
		System.out.println(min);
		
		}

}
