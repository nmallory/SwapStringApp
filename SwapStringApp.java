import java.util.Scanner;

public class SwapStringApp {

	public static void main(String[] args) {
		/*This program will swap words entered by a user*/
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter first word
		System.out.println("Enter first word:");
		String word1 = input.next();
		
		//Prompt user to enter second word
		System.out.println("Enter second word:");
		String word2= input.next();
		
		System.out.println("Words before swap:");
		System.out.println();
		
		//Prints to console words before swap
		System.out.println("Word1:" +word1);
		System.out.println("Word2:" +word2);
		System.out.println();
		
		//Swap values
		swap(word1, word2);

	}
	public static void swap(String word1, String word2){
		
		String temp = word1;
		word1 = word2;
		word2 = temp;
		
		System.out.println("Words after swap:");
		System.out.println();
		
		//Prints to console words after swap
		System.out.println("Word1:" +word1);
		System.out.println("Word2:" +word2);
	}
}
