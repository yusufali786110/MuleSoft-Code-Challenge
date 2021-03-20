package com.utils;

import java.lang.StringBuilder;

public class MyUtils {

	public static String changeCase(String s) {
		
		StringBuilder sb = new StringBuilder();
	     
	    // determine when the next capital letter will occur
	    Boolean nextCapital = false;
	 
	    // loop through the string value which is passed in from DataWeave expression
	    for (int i=0; i<s.length(); i++) {
	 
	      // check if the current character is a letter
	      if (Character.isLetter(s.charAt(i))) {
	 
	        // get the current character
	        char tmp = s.charAt(i);
	        //System.out.println("Found this: " + tmp + "for this index: " + i);
	 
	        if(i == 1)tmp = Character.toLowerCase(tmp);
	        
	        // make the char value a capital letter if required
	        
	        if (nextCapital && i != 1) tmp = Character.toUpperCase(tmp);
	        
	        //if (nextCapital) tmp = Character.toLowerCase(tmp);
	 
	        // add it to our output string
	        sb.append(tmp);
	 
	        // make sure the next character isn't a capital
	        nextCapital = false;
	 
	      } else {
	        // otherwise the next letter should be a capital
	        nextCapital = true;
	      }
	    }
	     
	    // return output string
	    return sb.toString();
	}
}