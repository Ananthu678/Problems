package DS;

public class IsAnagram {
	
	public static boolean anagram(String S1, String S2) {
		
		if(S1.length() != S2.length())
			return false;
		
		S1=S1.toLowerCase();
		S2=S2.toLowerCase();
		
		int letters[] =new int[1<<8];
		
		for(char c : S1.toCharArray())
			letters[c]++;
		
		for (char c:S2.toCharArray())
			letters[c]--;
		
		for (int i : letters)
			if(i!=0) {
				return false;
						}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		 String s1="ABc";
		 String s2= "Bcd";
		 
		 boolean check = anagram(s1,s2);
		 
		 if(check)
			 System.out.println("both strings are anagrams");
		 else
			 System.out.println("both strings are not anagrams");
			 
	}

}
