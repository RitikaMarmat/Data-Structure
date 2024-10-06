package DSA.Array;

public class MyArrayListClient {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(10);
		list.add(20);
	    list.add(30);
	  	list.add(40);
		list.add(50);
		//list.add(60);
		//list.add(70);
		list.add(80);
	//	//list.add(90);
	//	list.add(100);
	//	System.out.println("Before deleting the element");
	//	list.printData();

	//	System.out.println("\n***********");
	//	System.out.println(list.size());
		//list.deleteByIndex(4);
	//	list.deleteByElement(8);
	//	System.out.println(list.size());
	//	System.out.println("After deleting the element");
	//	list.printData();
	//	System.out.println();
	//	System.out.println(list.search(30));
		
		

			list.add(2, 70);

			list.printData();


		}

	}

