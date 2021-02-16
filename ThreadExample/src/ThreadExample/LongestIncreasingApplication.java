package ThreadExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LongestIncreasingApplication {

	public static void main(String[] args) throws Exception {


		int n = 20;
		SequenceGenerator sg = new SequenceGenerator(n);
		ArrayList<Integer> sequence = sg.GenerateSequence();
		
		//create lowest variable
		int lowest = 0;
		//create highest variable
		int highest = 0;
		
		int increasing = 0;
		int decreasing = 0;
		
		//create arraylist
		List<Integer> sub_seq = new ArrayList<>();
		int tempLongestSeq =0;
		int longestSeq = 0;
		boolean running = false;
		int start=0;
		int end=0;
		
		
		for (int i : sequence){
			
			start =0;
			end = 0;
			
			if(i+1 < sequence.size()-1) {
				//lowest = ;
				//highest = ;
				
				if(sequence.get(i) <= sequence.get(i+1)) {
					//lowest = sequence.get(i);
					//highest = sequence.get(i+1);
					tempLongestSeq++;
					
					//System.out.println(lowest+", "+highest);
					if(!running) {
						lowest = sequence.indexOf(i);
						running = true;	
					}
									
					
				}
				else if(running && (tempLongestSeq > longestSeq)){
					System.out.println("Starting new sequence");
					longestSeq = tempLongestSeq;
					tempLongestSeq = 0;
					
					decreasing++;
					running = false;
					System.out.println(running);
					highest = sequence.indexOf(i);
					//sub_seq.clear();
				}
			}
			
		}
		//System.out.println("Increasing: "+ increasing);
		//System.out.println("Decreasing: "+ decreasing);
		//System.out.println(start);
		//System.out.println(end);
		System.out.println(tempLongestSeq);
		System.out.println(sequence);
		System.out.println(sequence.subList(lowest, highest));
	}
}