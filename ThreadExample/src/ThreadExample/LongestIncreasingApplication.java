package ThreadExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LongestIncreasingApplication {

	public static void main(String[] args) throws Exception {


		int n = 100;
		SequenceGenerator sg = new SequenceGenerator(n);
		ArrayList<Integer> sequence = sg.GenerateSequence();
		
		//Create Counters		
		int tempLongestSeq =1;
		int longestSeq = 0;
		
		int highest =0;
		int lowest =0;
		
		//Print out the sequence
		System.out.println(sequence);
		
		//loop through arraylist
		for(int i = 0; i<= sequence.size()-2; i++) {	
			
			
			
			//compare values
			if(sequence.get(i) < sequence.get(i+1)) {
				
				//autoincrement temporary
				tempLongestSeq++;
				
				//print out the temporary longest sequence
				//System.out.println(tempLongestSeq);
				
				//compare temporary longest sequence with longest sequence
				if(tempLongestSeq >= longestSeq) {
					
					//if true, assign temporary value to longest value
					longestSeq = tempLongestSeq;
					highest = i+1;
					
				}
				
				
			}
			else {
				//System.out.println("False");
				
				//restart temporary sequence
				tempLongestSeq = 1;
				
				
			}
			//assign longest subsequence start value
			lowest = highest - (longestSeq -1);
			
		}
		//Print out the longest subsequence
		System.out.println();
		System.out.println("Lowest Index: "+lowest);
		System.out.println("Highest Index: "+highest);
		System.out.println();
		System.out.println(sequence.subList(lowest, highest+1));
		System.out.println("The longest subsequence is: "+longestSeq);
	}
			
}


