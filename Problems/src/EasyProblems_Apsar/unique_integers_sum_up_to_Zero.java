package EasyProblems_Apsar;

public class unique_integers_sum_up_to_Zero {
	
	public static void sumzero(int n) {
		int[] ans = new int[n];
        int start = 0;
        int end = n - 1;
        
        while(start < end){
            ans[start] = start + 1;
            ans[end] = ans[start] * (-1);
            start++;
            end--;
        }
        
        for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	public static void main(String[] args) {
		
		int n = 10;
		sumzero(n);
		
	
		
	}
}
