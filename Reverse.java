package DailyAssignment;

import java.util.Scanner;

public class Reverse {
	void reverse() {
		String rev = "";
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int n = A.length();
		for (int i = n - 1; i >= 0; i--) {
			rev = rev + A.charAt(i);
		}
		if (A.equals(rev))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
