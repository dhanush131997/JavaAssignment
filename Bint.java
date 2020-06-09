package DailyAssignment;

import java.math.BigInteger;
import java.util.Scanner;

public class Bint {
	void biginteger() {
		 Scanner userInput = new Scanner(System.in);
	        BigInteger a;
	        BigInteger b;
	        BigInteger sum = BigInteger.valueOf(0);
	        BigInteger product = BigInteger.valueOf(0);
	        
	        a = new BigInteger(userInput.nextLine());
	        b = new BigInteger(userInput.nextLine());
	        
	        sum = sum.add(a);
	        sum = sum.add(b);
	        product = a.multiply(b);
	        
	        System.out.println(sum);
	        System.out.println(product);
	}

}
