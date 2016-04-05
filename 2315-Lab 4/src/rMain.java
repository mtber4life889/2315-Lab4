
public class rMain {
	
	static int count = 0;

	public static void main(String[] args) {
		int[] insertionArrayDescending = {10,9,8,7,6,5,4,3,2,1};
		int[] insertionArrayAscending = {1,2,3,4,5,6,7,8,9,10};
		int[] insertionArrayRandom = {7,1,4,9,8,2,6,5,10,3};
		
		insertionSort(insertionArrayDescending, 10);
		System.out.println(count);
		count = 0;
		
		insertionSort(insertionArrayAscending, 10);
		System.out.println(count);
		count = 0;
		
		insertionSort(insertionArrayRandom, 10);
		System.out.println(count);
		count = 0;
		
	}
	
	public static void insertionSort(int[] a, int n) {
		   for (int index = 1; index < n; index++) {
		      int itemToInsert = a[index];

		      insertInOrder(itemToInsert, a, 0, index-1);
		   } // end for
		} // end insertionSort

		private static void insertInOrder(int item, int[] a, int begin, int end) {
		   int index = end;

		   while ((index >= begin) && (item < a[index])) {
		      a[index + 1] = a[index]; // move items to the right to make room
		      index--;
		      count = count + 1;
		   } // end while

		   a[index + 1] = item;        // insert item
		} // end insertInOrder


}
