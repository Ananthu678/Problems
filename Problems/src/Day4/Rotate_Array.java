package Day4;

import java.util.ArrayList;

public class Rotate_Array {
	
	public static void ArrayRotation(int a[], int n, int d) {
		
		ArrayList<Integer> aList =new ArrayList<Integer>();
		
		for(int i=d;i<n;i++) {
			aList.add(a[i]);
		}
		
		for(int i=0;i<d;i++) {
			aList.add(a[i]);
		}
		
		System.out.println(aList);
	}

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,8};
		int d=2;
		ArrayRotation(array,array.length,d);

	}

}
