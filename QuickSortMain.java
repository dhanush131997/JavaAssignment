package DailyAssignment;

public class QuickSortMain {

	public static void main(String[] args) {
		QuickSort q=new QuickSort();
		int i;  
        int[] arr={90,23,101,45,65,23,67,89,34,23};  
        q.quickSort(arr, 0, 9);  
        System.out.println("\n The sorted array is: \n");  
        for(i=0;i<10;i++)  
        System.out.println(arr[i]);  
	}

}
