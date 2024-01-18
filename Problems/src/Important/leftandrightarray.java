package Important;

public class leftandrightarray {
	
	public static int findElement(int a[], int n) {
		
		int left_sum=0, right_sum=0;
		
		for (int i = 1; i < n; i++) {
			right_sum+=a[i];
		}
		
		for (int i = 0,j=1; j < n; i++,j++) {
			
		     right_sum-=a[j];
		     left_sum+=a[i];
		     
		     if(left_sum==right_sum)
		    	 return a[i+1];
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		int arr[] = { 1,4,2,5 };
        int size = arr.length;
        System.out.println(findElement(arr, size));

	}

}
