package Day2;

import java.util.Stack;

public class Reverse_individual_words_sentence {

	public static void main(String[] args) {

       String s="words in this sentence must be reversed";
       
       Stack stk= new Stack();
       
       for (int i = 0; i < s.length(); i++) {
		
    	    if(s.charAt(i)!= ' ') {
    	    stk.push(s.charAt(i));
    	    }
    	    else {
    	    	while(stk.empty()==false) {
        	    	System.out.print(stk.pop());}
    	    	
    	    	System.out.print(" ");
    	    }
    	    
	}
       
    //System.out.print(" ");
    while(stk.empty()==false) {
    	System.out.print(stk.pop());}
       

	}

}
