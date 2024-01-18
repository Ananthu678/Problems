package Day2;

import java.util.Stack;

public class Reverse_Elements {
	
	public static void reverse(int a1[]) {
		
		Stack s=new Stack();
		
		for (int i = 0; i < a1.length; i++) {
			s.push(a1[i]);
		}
		
		for (int i = 0; i < a1.length; i++) {
			a1[i]=(int) s.pop();
		}
		
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}

	public static void main(String[] args) {
		
        int a[]= {1,4,5,8};
        reverse(a);
	}

}
