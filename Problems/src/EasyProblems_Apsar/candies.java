package EasyProblems_Apsar;

import java.util.ArrayList;
import java.util.List;

public class candies {
	
	public static List<Boolean> maxcandies(int[] candies, int extracandies){
		
		
		List<Boolean> b=new ArrayList<Boolean>();
		int max=0;
		boolean flag=true;
		
		for (int i = 0; i < candies.length; i++) {
			 max=candies[i]+extracandies;
			for (int j = 0; j < candies.length; j++) {
				if(max>=candies[j])
					flag=true;
				else if(max<candies[j]) {
					flag=false;
				    break;
			}
			}
			b.add(flag);
		}
		return b;
		
	}

	public static void main(String[] args) {
		int candies[]= {4,2,1,1,2};
		int extracandies=1;
		
		System.out.println(maxcandies(candies,extracandies));

	}

}
