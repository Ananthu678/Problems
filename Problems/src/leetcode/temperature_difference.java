package leetcode;

import java.util.Stack;

public class temperature_difference {
	
	public static int[] dailyTemperatures(int[] temps) {
		Stack<Integer> st = new Stack<>();
        int []res = new int[temps.length];
        
        for(int i=0;i<temps.length;i++){
            
            while(!st.empty() && temps[st.peek()] < temps[i]){
                
                int prev = st.pop();
                res[prev] = i - prev;
            }
            
            st.push(i);
        }
        return res;
        
    }

	public static void main(String[] args) {
		
		int[] temps = {73,74,75,71,69,72,76,73};
		int a[] =dailyTemperatures(temps);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
