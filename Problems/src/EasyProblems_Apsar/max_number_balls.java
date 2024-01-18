package EasyProblems_Apsar;

import java.util.HashMap;
import java.util.Map;

public class max_number_balls {
	
	public static int countBalls(int lowLimit, int highLimit) {
		Map<Integer,Integer> map = new HashMap<>();
        int count = Integer.MIN_VALUE;
        for(int i = lowLimit;i<=highLimit;i++){
            int value = 0;
            int temp = i;
            while (temp!=0){
                value += temp%10;
                temp/=10;
            }
            map.put(value,map.getOrDefault(value,0)+1);
            count = map.get(value) > count ? map.get(value) : count;
        }
        return count;
    }
		
	public static void main(String[] args) {

        int lowlimit=1, highlimit=10;
        countBalls(lowlimit, highlimit);

	}

}
