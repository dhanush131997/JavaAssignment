package DailyAssignment;

public class MergeSortMain {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		MergeSort ob1 = new MergeSort();

		System.out.println("Given Array");
		ob1.printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		ob1.printArray(arr);
	}

}
