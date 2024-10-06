package DSA.Array;

public class ArraySecondMin {
	public static void main(String[] args) {
		int[]arr= {150,120,50,90,10,15,85,60};
		int min=Integer.MAX_VALUE;// be can use 0 also
		int secmin=Integer.MAX_VALUE;;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)	{
				secmin=min;
				min=arr[i];
			}
			else if(secmin>arr[i] && arr[i]>min) {
				secmin=arr[i];
			}
		}
		
		System.out.println(secmin);
		
	}
}
