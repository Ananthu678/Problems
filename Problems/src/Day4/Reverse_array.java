package Day4;

public class Reverse_array {

	public static void main(String[] args) {
	 
		int arr[]= {0};
		reverse(arr);

	}
	
	static void reverse(int a[]) {
		
		 int left=0; int right=a.length-1;
		 
		 while(left<right) {
			 int temp=a[left];
			 a[left]=a[right];
			 a[right]=temp;
			 left++;
			 right--;
		 }
		 
		 for (int i = 0; i <a.length; i++) {
			 System.out.println(a[i] + " ");
		}
		 
		 
	}

}
