package Day2;

import java.util.Arrays;

public class Reverse_words_in_sentence {
	
	public static String convertStringArrayToString(String[] strArr, String delimiter) {
   	 
 		StringBuilder sb = new StringBuilder();
 		for (String str : strArr)
 			sb.append(str).append(delimiter);
 		     
 		return sb.substring(0, sb.length()-1);
 	}

	public static void main(String[] args) {
		
		String s="  reverse words in a string";
		
		String[] s1=s.split(" ");
		 int n=s1.length;
		 int l=0, r=n-1;
		 
	     while(l<r) {
	    	 String temp;
	    	 temp=s1[l];
	    	 s1[l]=s1[r];
	    	 s1[r]=temp;
	    	 l++;
	    	 r--;
	     }
	     
	     String str=convertStringArrayToString(s1, " ");
			/*
			 * for (int i = 0; i < s1.length; i++) { System.out.println(s1[i]); }
			 */
	     
	     System.out.println(str);
	     
	     
	   

	}

}
