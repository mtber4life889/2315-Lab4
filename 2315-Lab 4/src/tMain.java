
public class tMain {

	static int counts = 0;

	public static void main(String[] args) {
		int[] selectionArrayDescending = {10,9,8,7,6,5,4,3,2,1};
		int[] selectionArrayAscending = {1,2,3,4,5,6,7,8,9,10};
		int[] selectionArrayRandom = {7,1,4,9,8,2,6,5,10,3};
		
		/*for(int i = 0; i < selectionArrayDescending.length; i++)
		{
			System.out.println(selectionArrayDescending[i]);
		}
		System.out.println("\n");*/
		
		selectionSort(selectionArrayDescending, 10);
		System.out.println(counts);
		counts = 0;
		
		/*for(int i = 0; i < selectionArrayDescending.length; i++)
		{
			System.out.println(selectionArrayDescending[i]);
		}
		System.out.println("\n");*/
		
		/*for(int i = 0; i < selectionArrayAscending.length; i++)
		{
			System.out.println(selectionArrayAscending[i]);
		}
		System.out.println("\n");*/
		
		selectionSort(selectionArrayAscending, 10);
		System.out.println(counts);
		
		/*for(int i = 0; i < selectionArrayAscending.length; i++)
		{
			System.out.println(selectionArrayAscending[i]);
		}
		System.out.println("\n");*/
		
		selectionSort(selectionArrayRandom, 10);
		System.out.println(counts);

	}
	
	public static void selectionSort(int[] a, int n) {
		   for (int index = 0; index < n-1; index++) {
		      int indexOfNextSmallest = getIndexOfSmallest(a, index, n);
		      swap(a, index, indexOfNextSmallest);}
		} // end selectionSort

		public static int getIndexOfSmallest(int[] a, int first, int n) {
		   int min = a[first];
		   int indexOfMin = first;
		   for (int index = first+1; index < n; index++){  
			  counts = counts + 1;
		      if (a[index] < min) {
		         min = a[index];
		         indexOfMin = index;
		      } // end if
		   } // end for
		   return indexOfMin;
		} // end getIndexOfSmallest

		private static void swap(int[] a, int i, int j){
		      Object temp = a[i];
		      a[i] = a[j];
		      a[j] = (int) temp; 
		} // end swap

}
