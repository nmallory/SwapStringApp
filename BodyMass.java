
import java.util.Scanner;


public class BodyMass {

	public static void main(String[] args) {
		// Variables
		double weight;
		double height;
		double bmi; 
		String choice;
		
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Welcome message
		System.out.println("Welcome to the body mass calcular");
		
		do{
		//Prompt user to enter weight
		System.out.println("Please enter weight:");
		weight = input.nextDouble();
		
		//Prompt user to enter height
		System.out.println("Please enter height:");
		height = input.nextDouble();
		
		//Display BMI
		System.out.println("Your BMI Index is:" +BMI.calculateBMI(height, weight));
		
		//Ask user if they want to continue
		System.out.println("Continue (y/n)");
		choice = input.next();
		
		
		} while(choice.equalsIgnoreCase("y"));
		 
	 }
		
	
  
}


