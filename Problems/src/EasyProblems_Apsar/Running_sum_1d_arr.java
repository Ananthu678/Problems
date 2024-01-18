package EasyProblems_Apsar;

public class Running_sum_1d_arr {
	
	public static int[] sumarr(int[] nums) {
		
		for (int i = 1; i < nums.length; i++) {
			nums[i]=nums[i]+nums[i-1];
		}
		return nums;
	}
	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4};
		sumarr(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
