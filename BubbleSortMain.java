package DailyAssignment;

public class BubbleSortMain {

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		System.out.println("Array Before Bubble Sort");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		b.bubbleSort(arr);
		System.out.println("Array After Bubble Sort");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
