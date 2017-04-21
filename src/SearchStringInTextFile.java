/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simeon
 */
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchStringInTextFile {
  //  static String word = "Alice";
    static ArrayList<String> wordList  = new ArrayList<>(10);
    
    static {
            wordList.add("Alice");
           wordList.add("Carroll");              
    }   
        public static void main(String args[]) throws URISyntaxException {
//            wordList.add("Alice");
//            wordList.add("Carroll");           
            
	        try {                    
                    for (int iWord=0; iWord < wordList.size(); iWord++) {
                        
                        String word = wordList.get(iWord);        

                BufferedReader stream = new BufferedReader(new FileReader("pg11.txt"));
            
	            // Start a line count and declare a string to hold our current line.
	            int linecount = 0;
	                String line; 
	            // Let the user know what we are searching for
	            System.out.println("Searching for " + word + " in file...");	 

	            // Loop through each line, stashing the line into our line variable.
	            while ( ( line = stream.readLine() ) != null )
	            {
	                    // Increment the count and find the index of the word
	                    linecount++;
	                    int indexfound = line.indexOf(word);	 

	                    // If greater than -1, means we found the word
	                    if (indexfound > -1) {
	                       System.out.println(word + " was found at position " + indexfound + " on line " + linecount);
	                    }
	            }	 
	            // Close the file after done searching
	            stream.close();
                    
                    } // end of for
	        } //end of try
	        catch (IOException e) {
	            System.out.println("IO Error Occurred: " + e.toString());
	        }
                
              
	    }

	}
    
    
    
    
    
