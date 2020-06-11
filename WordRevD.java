package DailyAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class WordRevD {
	public void str4() {
		Scanner scanner = new Scanner(System.in);
		String sentence = null;

		System.out.println("Enter the sentence");
		sentence = scanner.nextLine();

		swapWord(sentence);

		scanner.close();
	}

	public static void swapWord(String sentence) {
		sentence = sentence + " ";
		char character[] = sentence.toCharArray(); 
		int space = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if(character[i] == ' ') {
				space++;
			}
		}
		
		String word[] = new String[space];
		space = 0;
		String temp = "";
		for (int i = 0; i < character.length; i++) {
			if (character[i] != ' ') {
				temp = temp + character[i];
			} else {
				 word[space++] = temp;
				 temp = "";
			}
		}
		
		for (int i = 0; i < word.length; i++) {
			if(i%2 == 0) {
				System.out.println(word);
			}
		}
	}
}
