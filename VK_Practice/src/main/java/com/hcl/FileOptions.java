package com.hcl;

import java.util.ArrayList;
import java.util.Scanner;


public class FileOptions {
	
	//create variable fileName
	private String fileName;
	//instantiate Actions class
	Actions act = new Actions();
	
	//menu method
	public void FileOptionsMenu(){
		System.out.println("Please select from the following options:");
		System.out.println();
		System.out.println("1. Add a File");
    	System.out.println("2. Delete A File");
    	System.out.println("3. Search A FIle");
    	System.out.println("4. Quit");
		
	}
	//Navigate method that takes in an int parameter
	public void Navigate(int choice) {
		//use choice to select case
		switch(choice) {
			case 1://add a file
				//call add method
				add();				
				break;
			case 2: //delete a file
				//call delete method
				delete();
			
				break;
			case 3: //search a file
				
				//call SearchFile() method
				SearchFile();
				break;
			default:
				//let user know selection was invalid
				System.out.println("Invalid option");
				break;
		}
	}
	
	//method to collect user input
	public String getInput() {
		System.out.println("Enter file name: ");
		Scanner scan = new Scanner(System.in);
		return (scan.nextLine());
		//return input;
		
	}
	//method that adds files to directory
	public void add() {
		//assign user input to fileName variable
        String fileName = this.getInput();
        System.out.println("You are adding a file named: " + fileName);
        System.out.println();
        //call AddTestData method and pass in fileName variable
        act.AddTestData(fileName);
		//System.out.println(act.getDirectory());
	
	}
	//method that deletes files from directory
	public void delete() {
		//assign user input to fileName variable
		fileName = getInput();
		//check if file exists in directory
		if(act.getDirectory().contains(fileName)) {
		System.out.println("You are deleting a file named: "+ fileName);
		//get the index of the file the user chose and assign to index variable
    	int index = act.getDirectory().indexOf(fileName);
    	//call RemoveFiles method and pass in index variable
    	act.RemoveFiles(index);
    			
    	}else {
    		//let user know the file was not found
    		System.out.println("File not found");
    	}
	}
	//method to search for file
	public void SearchFile() {
		//set status variable to Not Found
    	String status = "Not Found";
    	//assign user input to fileName
    	fileName = getInput();
    	//check if Directory contains the fileName specified by user
    	if(act.getDirectory().contains(fileName)) {
    		//set status to found
    		status = "Found";
    		//print out status
    		System.out.println(status);
    		
    	}else {
    		//keep status as not found
    		status = "Not Found";
    		//print out status
            System.out.println(status);
    		
    		
    	}
    	
    }

}
