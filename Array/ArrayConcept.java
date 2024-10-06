package DSA.Array;


	public class ArrayConcept extends Object {
		public static void main(String[] args) {
			int[][] arr = new int[5][5];
			int[][][] arr3 = new int[5][5][5];
			char[] ch = new char[5];
			int[] arr1 = new int[Integer.MAX_VALUE];

//			arr = ch;
//			arr[0] = ch;
//			arr = arr1;
			arr[0] = arr1;
			Object object = arr1;
			Object object1 = arr;
//			Object object = arr3;

			Object[] arr4 = new Object[5];
			// arr4 = arr1;
			Object[][] arr5 = new Object[5][5];
//			arr5 = arr4;
			arr5[0] = arr4;
			arr4 = arr;

			int[][] arr6 = new int[3][3];
			arr4 = arr6;
//			arr6 = arr4;

	}
	}


