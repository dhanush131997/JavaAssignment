
public class Frequency {

	public static void main(String[] args) {
		int[] a1=new int[] {1,2,3,2,2,4,5,5,6,7,8};
		int[] fr=new int[a1.length];
		int visited=-1;
		for (int i = 0; i < a1.length; i++) {
			int count=1;
			for (int j = i+1; j < a1.length; j++) {
				if(a1[i]==a1[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
				fr[i]=count;
			System.out.println("---------------------------------------");  
			System.out.println(" Element | Frequency");  
			System.out.println("---------------------------------------");  
			for(int i1 = 0; i1 < fr.length; i1++){  
			if(fr[i1] != visited)  
			System.out.println("    " + a1[i1] + "    |    " + fr[i1]);  
			}  
			System.out.println("----------------------------------------");
				
			
		}
	}

}
