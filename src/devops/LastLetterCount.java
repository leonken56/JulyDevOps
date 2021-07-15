package devops;

import java.util.Scanner;

public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Please enter a string: ");
		String inputString = myObj.nextLine();  // Read user input
		int n = inputString.length();
		Scanner words = new Scanner(inputString).useDelimiter(" ");
		int countS = 0;
		int countY = 0;
		int numWords = 0;
		int firstS_index = -1;
		int firstY_index = -1;
		
		
		String stringArray[] = new String[100];
		while (words.hasNext())
		{
			String curWord = words.next();
			stringArray[numWords] = curWord;
			//System.out.println(curWord);
			int m = curWord.length();
			if (curWord.charAt(m-1) == 's')
			{
				countS++;
				if (firstS_index == -1)
					firstS_index = numWords;
			}
			else if (curWord.charAt(m-1) == 'y')
			{
				countY++;
				if (firstY_index == -1)
					firstY_index = numWords;
			}
				
			numWords++;
			
			//words.next();
		}

		
		System.out.println("Number of words that ends with s: "+ countS);
		System.out.println("Number of words that ends with y: "+ countY);
		//Switch the first instance of word that end with 's' and 'y
		if ((firstS_index != -1) && (firstY_index != -1))
		{
			String temp = stringArray[firstS_index];
			stringArray[firstS_index] = stringArray[firstY_index];
			stringArray[firstY_index] = temp;
			System.out.print("Sentence where words are switched: ");
			for (int i=0;i<numWords;i++)
				System.out.print(stringArray[i]+" ");
			System.out.println();
			
		}
		else System.out.println("Cannot switch due to missing instance of word that end with 's' or 'y'");
	}

}
