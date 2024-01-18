package Strings;

import java.util.Iterator;

public class no_of_occurences_single {
	
	static int count(String S, char C) {
		
		int res=0;
		for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i)== C)
				res++;
		}
		return res;
		
		
	}

	public static void main(String[] args) {

         String s="Hello world";
         char c='l';
         
         System.out.println(count(s,c));
	}

}
