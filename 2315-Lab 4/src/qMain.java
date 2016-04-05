
public class qMain {
	static int count = 0;

	public static void main(String[] args) {
		int[] quickSortArrayDescending = {10,9,8,7,6,5,4,3,2,1};
		int[] quickSortArrayAscending = {1,2,3,4,5,6,7,8,9,10};
		int[] quickSortArrayRandom = {7,1,4,9,8,2,6,5,10,3};
		
		quickSort(quickSortArrayDescending, 0, 9);
		System.out.println(count);
		count = 0;
		
		quickSort(quickSortArrayAscending, 0, 9);
		System.out.println(count);
		count = 0;
		
		quickSort(quickSortArrayRandom, 0, 9);
		System.out.println(count);
		count = 0;

	}
	
	private static void quickSort(int a[], int left, int right) {
		   int index = partition(a, left, right);  // everything to left of index
		                                           // will be <= pivot, everything
		                                           // to right will be >= pivot
		   if (left < index - 1)
		      quickSort(a, left, index - 1);  // sort left half
		                                        // from a[left] to a[index-1]
		   if (index < right)
		      quickSort(a, index, right);     // sort right half
		}                                       // from a[index] to a[right]

		private static int partition(int a[], int left, int right) {
		   int i = left, j = right;
		   int tmp;
		   int pivot = a[(left + right) / 2];

		   while (i <= j) {
		      while (a[i] < pivot)  // scan from left
		         i++;
		      count = count + 1;
		      while (a[j] > pivot)  // scan from right
		         j--;
		      count = count + 1;
		      if (i <= j) {         // swap
		         tmp = a[i];
		         a[i] = a[j];
		         a[j] = tmp;
		         i++;
		         j--;
		      }
		   };
		   return i;     // this will be the dividing point between the two halves
		}


}
