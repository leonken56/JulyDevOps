package devops;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Please enter a string: ");
		String inputString = myObj.nextLine();  // Read user input
		char vowel[] = {'u','e','o','a','i','U','E','O','A','I'};
		int n = inputString.length();
		int m = 10;
		int count = 0;
		for (int i=0; i<n; i++ )
			for (int j=0; j<m; j++)
				if (inputString.charAt(i)==vowel[j])
					count++;
		System.out.println("Number of vowel character: "+ count);
		
	}

}
