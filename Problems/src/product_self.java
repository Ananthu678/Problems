
public class product_self {
	
	public static void productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        
       for(int i=0; i<ans.length;i++) {
    	   System.out.println(ans[i]);
       }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {1,2,3,4};
		productExceptSelf(nums);

	}

}
