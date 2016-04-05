import java.util.Arrays;

public class sMain {
	
	static int counter = 0;

	public static void main(String[] args) {
		int[] shellSortArrayDescending = {10,9,8,7,6,5,4,3,2,1};
		int[] shellSortArrayAscending = {1,2,3,4,5,6,7,8,9,10};
		int[] shellSortArrayRandom = {7,1,4,9,8,2,6,5,10,3};
		
		System.out.println(Arrays.toString(shellSortArrayRandom));
		shellSort(shellSortArrayRandom, 10, 1, 9);
		System.out.println(Arrays.toString(shellSortArrayRandom));
		System.out.println(counter);
		counter = 0;

	}
	
	public static void shellSort(int[] a, int n, int first, int last)
	{
		int numOfItems = last + 1;
		int gap = numOfItems / 2;
		
		while (gap > 0)
		{
			for(int begin = 0; begin < first + gap; begin++)
			{
				incrementalInsertionSort(a, 0, n-1, gap);
			}
			gap = gap / 2;
		}
	}
	
	private static void incrementalInsertionSort(int [] a, int first, int last, int gap)
	{
		int toSort, index;
		
		for(toSort = first + gap; toSort <= last; toSort = toSort + gap)
		{
			int nextToInsert = a[toSort];
			index = toSort - gap;
			while((index >=first) && (nextToInsert < a[index]))
			{
				a[index + gap] = a[index];
				index = index - gap;
				counter = counter + 1;
			}
			a[index + gap] = nextToInsert;
		}
	}


}
