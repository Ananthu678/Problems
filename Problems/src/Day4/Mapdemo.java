package Day4;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapdemo {

	public static void main(String[] args) {
		
		int a[]= {1,5,3,4,4,7,8,9,4};
		//duplicates1(a);
		duplicates(a);
		

	}
	
	/*
	 * static void duplicates1(int arr[]) {
	 * 
	 * Map<Integer, Integer> mp =new LinkedHashMap<Integer, Integer>();
	 * 
	 * for (int i = 0; i < arr.length; i++) { if(mp.containsKey(arr[i])) { int
	 * count=mp.get(arr[i]); mp.put(arr[i], count+1); } else mp.put(arr[i], 1); }
	 * 
	 * }
	 */
	
static void duplicates(int arr[]) {
		
		Map<Integer, Integer> mp =new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(mp.containsKey(arr[i])) {
				int count=mp.get(arr[i]);
				mp.put(arr[i], count+1);
			}
			else
			mp.put(arr[i], 1);
		}
 		
		for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			  if(entry.getValue()>1) {
				  System.out.println("duplicate elements found");
			  }
		}
		
	}

    

}
