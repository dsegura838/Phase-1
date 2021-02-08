package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Handler {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		//create variables
		String choice;
		String fileName;
		
		//call displayMessage()
		displayMessage();
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//assign user choice to scanner
		choice = input.nextLine().toUpperCase();
		
		
		try {
			//ask for file name
			System.out.println("Enter file name: ");
			fileName = input.nextLine();
			
			if(choice.equals("W")) {
				//Call writefile
				writeFile(fileName);
				
			}
			//read from file
			else if(choice.equals("R")) {
				//call readFile
				readFile(fileName);
				
			}
			else if(choice.equals("A")) {
				//append to file
				appendFile(fileName);
			}
			else {
				//invalid option
				System.out.println("Please enter a valid option");
			}
					
		}
		catch(Exception ex) {
			
			//Display error message
			System.out.println(ex.getMessage());
			
		}
		finally {
			
			//close the file
			input.close();
			}
	}
		
	public static void displayMessage() {
	//ask user what they want to do
		System.out.println("What would you like to do?");
		System.out.println("Write = w");
		System.out.println("Read = r");
		System.out.println("Append = a");
				
	}
	//method to write to a file
	public static File writeFile(String fileName) throws FileNotFoundException {
		
		//create variable
		String contents;
		
		//check if file exists
		File file = new File(fileName);
				
		//pass filename to printwriter
		PrintWriter writer = new PrintWriter(fileName);
		
		//Create new scanner
		Scanner inputFile_w = new Scanner(System.in);
					
		//Tell user to write to the file
		System.out.println("Write to "+fileName+":");
			
		contents = inputFile_w.nextLine();
			
		//add user input to file
		writer.write(contents);
		writer.close();
		System.out.println("File was written to");
					
		return file;
	}
	//method to read from a file
	public static File readFile(String fileName) throws FileNotFoundException{
		
		//create file instance
		File file = new File(fileName);
			
		//Create variable
		String contents;
			
		//Create new scanner
		Scanner inputFile = new Scanner(file);
			
		while(inputFile.hasNext()) {
			//Read the next line
			contents = inputFile.nextLine();
				
			//print out file contents
			System.out.println(contents);
				
			}
			return file;
				
	
		
	}
	public static File appendFile(String fileName) throws IOException{
		
		//create variable
		String additions;
		
		//create file instance
		File file = new File(fileName);
		FileWriter fr = new FileWriter(fileName, true);
		
		
		//Create new scanner
		Scanner inputFile_a = new Scanner(System.in);
				
		//Ask the user what they want to add
		System.out.println("Add new contents to file "+fileName+":");

		
		//assign user input to additions
		additions = inputFile_a.nextLine();
		
		
		//appends contents to file
		fr.write("\n"+additions);
		fr.close();
		
		
		System.out.println("File was appended");
		return file;
		
	}
	
}
