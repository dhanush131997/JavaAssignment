package DailyAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class WordRevb {
	public void str1() {
		Scanner scanner = new Scanner(System.in);
		String sentence = null;

		System.out.println("Enter the sentence");
		sentence = scanner.nextLine();

		reverseWordNum(sentence);

		scanner.close();
	}

	public static void reverseWordNum(String sentence) {
		sentence = sentence + " ";
		char character[] = sentence.toCharArray();
		int count = 0;
		String word = "";
		for (int i = 0; i < character.length; i++) {
			if (character[i] != ' ') {
				count++;
				word = word + character[i];
			} else {
				System.out.print(word + "" + count + " ");
				word = "";
				count = 0;
			}
		}

	}
}
