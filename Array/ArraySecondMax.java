package DSA.Array;

public class ArraySecondMax {
	public static void main(String[] args) {
		int[]arr= {150,120,50,90,10,15,85,60};
		int max=Integer.MIN_VALUE;// be can use 0 also
		int secmax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)	{
				secmax=max;
				max=arr[i];
			}
			else if(secmax<arr[i] && arr[i]<max) {
				secmax=arr[i];
			}
		}
		
		System.out.println(secmax);
		
	}
}
