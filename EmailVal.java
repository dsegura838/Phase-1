package emailValidation;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class EmailVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create variable
		String email;
		String check;
		String again;
		
		//create arrayList
		ArrayList<String> emailList = new ArrayList<String>();
		
		//initiate while loop
		again = "Y";
		
		//create while loop
		while (again.equals("Y")) {
			
			//create a scanner
			Scanner checker = new Scanner(System.in);
			
			//ask user for email
			System.out.println("Enter an email: ");
			
			//assign user input to email variable
			email = checker.nextLine();
			
			//create pattern we are looking for
			final String regex = "\\w+@\\w+.\\w+";
			
			//validate user input
			check = email;
			
			//set pattern
			final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
			//match user input to pattern
			final Matcher matcher = pattern.matcher(email);
			
			//if email is valid
			if (matcher.matches()) {
				System.out.println("Valid Email: " + matcher.group(0));
				
				//add email to arraylist
				emailList.add(email);
				
				//ask user if they want to add another email
				System.out.println("Would you like to add another email? (Y or N)");
				
				
				//assign users choice to again
				again = checker.next().toUpperCase();
											
			}
			
			//if email is invalid
			else {
				System.out.println("Please add a valid email");
				
				//re-enter loop
				again = "Y".toUpperCase();
			}
			
		}
		
		
		//create a variable to store email
		String input;
		
		//create scanner
		Scanner search = new Scanner(System.in);
		
		//ask user to enter an email to search for
		System.out.println("Enter email you wish to search for: ");
		
		//assign user input to input variable
		input = search.nextLine();
		
		//search for input in emailList ArrayList
		if (emailList.contains(input)){
			
			//let user know that the email was found
			System.out.println("Email found!");
		}
		else {
			System.out.println("Email not found");
		}		
		  
	}

}


