package Day2;

import java.util.Iterator;

public class Arrays_with_given_sum_using_twoloops {
	
	public static void findtarget(int[] a, int sum) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(sum==a[i]+a[j]) {
					System.out.println("the pair is found"+ (a[i]+ "," + a[j]));
				    break;
				}
			}
		}
		 
	}

	public static void main(String[] args) {

		 int array[]= {8,7,4,3,2,6};
		 int target=10;
		 
		 findtarget(array,target);
        

	}

}
