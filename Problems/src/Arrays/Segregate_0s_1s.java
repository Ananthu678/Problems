package Arrays;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Segregate_0s_1s {
	
	static void segregate(int a[]) {
		int n=a.length;
		int left=0; 
		int right=n-1;
		
		while(left<right) {
			
			 if(a[left]==0)
				 left++;
			 
			 else if(a[right]==1)
				 right--;
			 else
			 {
				 int temp;
				temp = a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			 }
		}
		
		/*
		 * for (int i = 0; i < a.length; i++) { System.out.print(a[i] + " "); }
		 */
		
		System.out.println(Arrays.toString(a));
	}
	
	
	
	public static void main(String[] args) {
		
		int array[]= {0,1,1,0,0,0,1,1,0,1};
		segregate(array);
		
		
		
		
	}

}
