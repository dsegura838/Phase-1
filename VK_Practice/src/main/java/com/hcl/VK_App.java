package com.hcl;

import java.util.Scanner;

public class VK_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiate welcome menu
		Welcome_Menu wm = new Welcome_Menu();
		//call show method
		wm.Show();
		
		//set again to Y
		String again = "Y";
		
		while (again.equals("Y")){
			//call welcome screen method
			wm.WelcomeScreen();
			//create switch statement
			switch(getNumInput()) {
				case 1://show files
					//instantiate actions
					Actions a = new Actions();
					//call sort method
					a.Sort();
					//display the files
					a.PrintFiles();
					
					break;
				case 2://show file options menu
					//instantiate fileoptions class
					FileOptions fo = new FileOptions();
					//call the menu method from file options
					fo.FileOptionsMenu();
					//get the users input and assign to choice
					int choice = getNumInput();
					
					while(choice !=4 ) {
						//call navigate method and pass in choice
						fo.Navigate(choice);
						System.out.println();
						//call menu method again
						fo.FileOptionsMenu();
						//get the users choice again
						choice = getNumInput();
					}
					break;
				case 3: //quit
					//quit the program
					again = "N";
					break;
				default:
					//let user know entry is invalid
					System.out.println("Invalid Option");
					//ask if they want to continue
					System.out.println("Do you want to continue?: (Y or N)");
					//get input and assign to again
					again = getStrInput().toUpperCase();
					break;
			
			}
			
		}
		
		
		
		
		

	}
	public static int getNumInput() {
		//create scanner
		Scanner sc = new Scanner(System.in);
		//assign to input
		int input = sc.nextInt();
		//return input
		return input;
		
	}
	public static String getStrInput() {
		//create scanner
		Scanner sc = new Scanner(System.in);
		//assign to input
		String input = sc.nextLine();
		//return input
		return input;
	}

}
