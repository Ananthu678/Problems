package Strings;

import java.util.HashMap;
import java.util.Map;

public class print_no_ofoccurences_digit {
	
	public static void printstring(String s1) {
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		s1=s1.replaceAll("//s", "");
		
		for (char c : s1.toCharArray()) {
			if(mp.containsKey(c)) {
				int count=0;
				count = mp.get(c);
				mp.put(c, count+1);
			}
			
		else
			mp.put(c, 1);
			
		}
		
		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
			
			StringBuilder sb=new StringBuilder();
			sb.append(entry.getKey()).append(entry.getValue());
			System.out.print(sb);
		}
	}

	public static void main(String[] args) {

        String s ="aabbbccccaaaaa";
        printstring(s);

	}

}
