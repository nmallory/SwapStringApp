import java.util.Scanner;

public class SwapNumbersApp {

	public static void main(String[] args) {
		/*This program will swap numbers entered by a user*/
		
		//Create scanner 
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a number
		System.out.println("Enter first number:");
		int num1 = input.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = input.nextInt();
		
		System.out.println("Before swapping:");
		System.out.println();
		System.out.println("Value of num1:" +num1);
		System.out.println("Value of num1:" +num2);
		System.out.println("");
		
		//Swap values
		swap(num1, num2);
   
	}

	private static void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping:");
		System.out.println();
		System.out.println("Value of num1:" +num1);
		System.out.println("Value of num2:" +num2);
		
	}

}
