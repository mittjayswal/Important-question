package com.as.mitt.javainterview;

public class ReverseStringUsingRecursive {

	String reverse = "";
    
    public String reverseString(String str){
         
      if (str.length()==1) {
    	  return str;
      }else {
    	  reverse += str.charAt(str.length()-1)
    			  + reverseString(str.substring(0, str.length()-1));
      }
      return reverse;
    }
     
    public static void main(String a[]){
    	ReverseStringUsingRecursive srr = new ReverseStringUsingRecursive();
        System.out.println("Result: "+srr.reverseString("mitrt"));
    }
}
