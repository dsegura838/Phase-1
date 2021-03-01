package com.hcl;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Welcome_Menu {
	//Greeting messages
		private String welcomeText = "Welcome to VirtualKey!";
		private String namePrompt = "Enter your name: ";
	    private String developerText;
	    
	    //menu options
	    public static void WelcomeScreen() {
	    	System.out.println();
	    	System.out.println("What would you like to do next?: ");
	        System.out.println();
	    	System.out.println("1. Show Files");
	    	System.out.println("2. Show File Options Menu");
	    	System.out.println("3. Quit");   	

	    }
	    //initial display
	    public void Show()
	    {
	        System.out.println(welcomeText);
	        System.out.println(namePrompt);
	        String input = this.getInputString();
	        String developerText = input;
	        System.out.println("Developer: " + developerText);
	        System.out.println("\n");
	        
	    }
	    //get user input in string format
	    private String getInputString()
	    {

	        Scanner in = new Scanner(System.in);
	        return(in.nextLine());

	    }

}
