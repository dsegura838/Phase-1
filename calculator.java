package calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		
		double num1;											//declare a variable to hold num1
		double num2;											//declare a variable to hold num2
		String choice;											//declare a variable to reference the user's choice
		
		Scanner calculation = new Scanner(System.in);			//Create scanner object
		
		System.out.println("What would you like to do: \n");		//ask user for input
		
		System.out.println("add");
		System.out.println("subtract");
		System.out.println("multiply");
		System.out.println("divide\n");
		
		choice = calculation.nextLine();						//Read the user input
		
		System.out.println("user choice is "+ choice+ "\n");			//Let the user know their choice
		
		String again = "Y";										//Assign Y to again
		
		while(again.equals("Y")) {									//Initiate a while loop
			
			
			if (choice.equals("add")) {						//if statement for add option
				
				System.out.println("Select a number");			//prompt user for first number
				
				num1 = calculation.nextDouble();				//assign user's input to num1
				
				System.out.println("Select another number");	//prompt user for second number
				num2 = calculation.nextDouble();				//assign input to num2
				
				double total = 0;								//create a variable to store result
				total = returnADouble(num1 + num2);				//perform calculation
					
				System.out.println(num1 + " + " + num2 + " = "+ total+"\n");			//output the result
				
				System.out.println("Run another calculation?: (Y to continue)");				//prompt user for another calculation
				again = calculation.next().toUpperCase();								//get user's input
				
				
					
			}
			else if(choice.equals("subtract")) {				//else if for subtract option
				
				System.out.println("Select a number");			//prompt user for first number
					
				num1 = calculation.nextDouble();				//assign user's input to num1
					
				System.out.println("Select another number");	//prompt user for second number
				num2 = calculation.nextDouble();				//assign input to num2
					
				double total = 0;								//variable to store result
				total = returnADouble(num1 - num2);				//perform calculation
						
				System.out.println(num1 + " - " + num2 + " = "+ total);			//output the result
					
					
				System.out.println("Run another calculation?: (Y to continue)");				//prompt user for another calculation
				again = calculation.next().toUpperCase();								//get user's input
			}
			else if(choice.equals("multiply")) {
				
				System.out.println("Select a number");			//prompt user for first number
					
				num1 = calculation.nextDouble();				//assign user's input to num1
					
				System.out.println("Select another number");	//prompt user for num2
					
				num2 = calculation.nextDouble();				//assign input to num2
					
				double total = 0;								//variable to store result
				total = returnADouble(num1 * num2);				//perform calculation
						
				System.out.println(num1 + " * " + num2 + " = "+ total);			//output the result
					
				System.out.println("Run another calculation?: (Y to continue)");				//prompt user for another calculation
				again = calculation.next().toUpperCase();								//get user's input
			}
			else if(choice.equals("divide")) {
				
				System.out.println("Select a number");			//prompt user for first number
					
				num1 = calculation.nextDouble();				//assign user's input to num1
					
				System.out.println("Select another number");	//get another number
				num2 = calculation.nextDouble();				//assign input to num2
					
				double total = 0;								//variable to store result
				total = returnADouble(num1 / num2);				//calculate
						
				System.out.println(num1 + " / " + num2 + " = "+ total);			//output the result
					
				System.out.println("Run another calculation?: (Y to continue)");				//prompt user for another calculation
				again = calculation.next().toUpperCase();								//get user's input
			}
			else {														//in case user selected invalid option
				System.out.println("Please enter a valid choice\n");	//Let user know what they did wrong
				System.out.println("What would you like to do: \n");	//ask user for input
				System.out.println("add");
				System.out.println("subtract");
				System.out.println("multiply");
				System.out.println("divide");
					
					choice = calculation.nextLine();
					again = "Y";											//re-enter while loop
			}
			
		}
			
		}
		private static double returnADouble(double d) {
			// TODO Auto-generated method stub
			return (double) d;							//Create a method that returns double no matter the input
				
	}
		
}

