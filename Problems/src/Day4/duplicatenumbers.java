package Day4;

import java.util.Scanner;

public class duplicatenumbers {

	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a[]=new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		 for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j]) {
						System.out.println(a[j] + " ");
						break;
					}
				}
			}

	}

}
