package com.hcl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Actions {
	
	//create directory to store files
	private static ArrayList<String> Directory = new ArrayList<>();
		
	//method that adds files to directory
	public static void AddTestData(String file) {
        Directory.add(file);
	}
	//method that removes files from directory
	public static String RemoveFiles(int file) {
    	Directory.remove(file);
    	return "File Removed";
    }
	
	//method that returns Directory
	public static ArrayList<String> getDirectory() {
		return Directory;
	}
	//method that sets directory
	public static void setDirectory(ArrayList<String> directory) {
		Directory = directory;
	}
	
	//method that sorts directory
	public static void Sort() {
		Collections.sort(Directory);
		
	}
	
	//method that prints the files in the directory
	public static void PrintFiles() {

        for (String i : Directory)
        {
            System.out.print(i+" ");
        }
    }

}
