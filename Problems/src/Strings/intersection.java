package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class intersection {
	
	/*
	 * public static void intersection(int[] a1, int[] a2) {
	 * 
	 * Arrays.sort(a1); Arrays.sort(a2);
	 * 
	 * int i=0, j=0;
	 * 
	 * 
	 * ArrayList<Integer> a = new ArrayList<Integer>();
	 * 
	 * while(i<a1.length && j<a2.length) {
	 * 
	 * if(a1[i]<a2[j]) { i++;} else if(a1[i]>a2[j]) { j++;} else { a.add(a1[i]);
	 * i++; j++; } } System.out.println(a); }
	 */
	
	public static void intersection1(int[] a1, int[] a2) {
		
		ArrayList<Integer> aList1 = new ArrayList<>();
		ArrayList<Integer> aList2 = new ArrayList<>();
		
		for(int i : a1)
			aList1.add(i);
		for(int i : a2)
			aList2.add(i);
		
		System.out.println(aList1);
		System.out.println(aList2);
		//aList1.retainAll(aList2);
		aList1.addAll(aList2);
		
		System.out.println(aList1);
		//System.out.println(aList1);
	}

	public static void main(String[] args) {

          int array1[]= {5,4,7,8};
          int array2[]= {1,2,3,4,5,7};
          
          //intersection(array1, array2);
          intersection1(array1, array2);

	}

}
