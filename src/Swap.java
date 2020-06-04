import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		System.out.println("enter two values a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swapping:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping:"+a+" "+b);
		
	}

}
