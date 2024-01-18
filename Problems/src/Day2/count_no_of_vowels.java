package Day2;

public class count_no_of_vowels {

	public static void main(String[] args) {

       String s="I ate mangoes.";
       int wordcount=0, vowelcount=0, uppercount=0;
       
       for (int i = 0; i < s.length(); i++) {
		 char c=s.charAt(i);
		 
		switch(c) {
		 case ' ' :
		 case '.':
		 case '"':
			 wordcount++;
		 }
		
		switch(c) {
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			vowelcount++;
		}
		
		if(c>=65 && c<=90) {
			uppercount++;
		}
	   }
       
       System.out.println(wordcount + " " + vowelcount + " " + uppercount);

	}

}
