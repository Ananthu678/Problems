package Day4;

public class Solution {

	public static void main(String[] args) {

        int temp[]= {-1,-10,10,5,30,15,20,-10,30,10,29,20};
        System.out.println(solution(temp));
        

	}
	
	public static String solution(int[] T) {
	       String seasons[] = {"WINTER", "SPRING", "SUMMER", "AUTUMN"};
	        int amplitude = Integer.MIN_VALUE;
	        int season = 0;
	        int intervalEnd = T.length/4;
	        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	        int result = 0;
	        for (int i = 0; i < T.length; i++)
	        {            
	            if (i < intervalEnd)
	            {
	                min = Math.min(T[i], min);
	                max = Math.max(T[i], max);
	            }
	            if(i == intervalEnd - 1)
	            {
	                int currentAmplitude = max - min;
	                intervalEnd = intervalEnd + T.length/4;
	                min = Integer.MAX_VALUE;
	                max = Integer.MIN_VALUE;
	                if(amplitude < currentAmplitude) {
	                    amplitude = currentAmplitude;
	                    result = season;
	                }
	                season++;
	            }
	        }        
	        return seasons[result];
	    }
	

}
