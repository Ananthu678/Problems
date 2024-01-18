package Day3;

public class Segrgate_postive_negative_numbers {
	
	static void segregate(int a[]) {
		
		int n=a.length;
		int left=0, right=n-1;
		
		while(left<right) {
			
			while(a[left]<0 && left<right) {
				left++;
			}
			
			while(a[right]>0 && left<right) {
				right--;
			}
			
			if(left<right) {
				int temp;
				temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]= { -12, 11, -13, -5,
            6, -7, 5, -3, -6 };
		
		segregate(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
