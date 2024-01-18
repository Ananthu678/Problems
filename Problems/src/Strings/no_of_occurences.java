package Strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class no_of_occurences {
	
	public static void no_of_occurences_of_character(String S) {
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		S=S.replaceAll("\\s", "");
		
		for (char c : S.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
			  map.put(c, 1);
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ "    " + entry.getValue());
		}
	}
	

	public static void main(String[] args) {

       String s="Hello world";
       no_of_occurences_of_character(s);

	}

}
