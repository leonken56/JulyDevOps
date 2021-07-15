package devops;

import java.util.Scanner;

public class words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Please enter a string: ");
		String inputString = myObj.nextLine();  // Read user input
		int n = inputString.length();
		Scanner words = new Scanner(inputString).useDelimiter(" ");
		int count = 0;
		while (words.hasNext())
		{
			count++;
			words.next();
		}
		System.out.println("Number of words: "+ count);
	}

}
