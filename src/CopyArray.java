
public class CopyArray {

	public static void main(String[] args) {
		int[] a1=new int[] {1,2,3,4,5,6};
		int[] a2=new int[a1.length];
		
		for (int i = 0; i < a1.length; i++) {
			a2[i]=a1[i];
		}
		System.out.println("the original array is:");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("the elements of new array is:");
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]+" ");
		}
	}

}
