package fixBugs;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
	
	static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
     
      //create a scanner
        Scanner scan = new Scanner(System.in);
        /////////////////////////////////////////
        System.out.println("Enter the expense you need to search:\t");
        //Complete the method***
        int search = scan.nextInt();
        if(arrayList.contains(search)) {
        	System.out.println("Expense Found: "+search);
        	System.out.println();
        }else {
        	System.out.println("Not Found :(");
        	System.out.println();
        }
        /////////////////////////////////////////   
         
        
    }

}
