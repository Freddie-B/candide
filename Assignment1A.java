package freddie;

import java.util.Scanner;

public class Assignment1A {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
	  
		String firstWord;
	    String secondWord;
	    String wordTot;
	    int wordLength;
	
		System.out.print("Skriv ett ord: ");
		firstWord = scanner.next();
		
		System.out.print("Skriv ytterligare ett ord: ");
		secondWord = scanner.next();
		
		wordTot = firstWord + " " + secondWord;
		System.out.println(wordTot);
		
		wordLength = wordTot.length();
		System.out.print(wordLength);
		
		
		scanner.close();
		
	
		
		

	}

}
