package DailyAssignment;

public class SelectionSortTest {

	public static void main(String[] args) {
		SelectionSort s1 = new SelectionSort();
		int numarr[] = { 101, 5, 18, 11, 80, 67 };

		System.out.print("Original array: ");
		s1.printArr(numarr);

		// calling method for selection sorting
		s1.selectionSort(numarr);

		System.out.print("Sorted array: ");
		s1.printArr(numarr);
	}

}
