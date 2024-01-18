package EasyProblems_Apsar;

import java.util.Arrays;

public class height_checker {
	
	public static int heightchecker(int[] heights) {
		
		int expected[]=heights.clone();
		Arrays.sort(expected);
		
		int result=0;
		
		for (int i = 0; i < heights.length; i++) {
			if(heights[i]!=expected[i])
				result++;
		}
		return result ;
		
	}

	public static void main(String[] args) {
		
		int heights[]= {1,1,4,2,1,3};
		int output = heightchecker(heights);
		
		System.out.println(output);
		
	}

}
