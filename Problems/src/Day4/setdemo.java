package Day4;

import java.util.HashSet;

public class setdemo {

	public static void main(String[] args) {

       int arr[]= {2,5,1,6,2,4,5,9,0,1,0,7,6};
       removeduplicates(arr);
       

	}
	
	static void removeduplicates(int a[]) {
		
		 HashSet<Integer> set = new HashSet<Integer>();
		  
		 for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		 
			System.out.println(set);
		
	}

}
