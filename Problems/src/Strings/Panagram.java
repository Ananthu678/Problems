package Strings;

public class Panagram {
	
	static final int MAX_CHAR=26;
	
	public static boolean ispanagram(String s) {
		
		s= s.replaceAll("\\s", "");
		
		int[] letters = new int[MAX_CHAR];
		
		for(char c : s.toCharArray())
			letters[c - 'a']++;
		
		for(int i : letters)
			if(i==0)
				return false;
		
		return true;
		
	}

	public static void main(String[] args) {

        String s1 = "the quick brown fox jumps over the lazy dog";
        
        boolean result = ispanagram(s1);
        
        if(result)
        	System.out.println("Strings are panagrams");
        else
        	System.out.println("Strings are not panagrams");
   
	}
}
