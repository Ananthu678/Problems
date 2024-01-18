package EasyProblems_Apsar;

import java.util.LinkedList;
import java.util.Queue;

public class unable_to_eat_sandwich {
	
	public static int countstudents(int[] students, int[] sandwich) {
		 
		Queue<Integer> q = new LinkedList<>();
	    int top = 0, count = 0;//top points to the current sandwich

	    for(int e : students)
	        q.add(e);

	    while(!q.isEmpty() && count != q.size()){// count keeps the track of students processed in continuous manner 
	        if(q.peek() == sandwich[top]) {//if student at front can eat the sandwich at top
	            count = 0;
	            top++;//increment top pointer
	            q.poll();
	        } else {
	            q.add(q.poll());//move the student to the rear
	            count++;
	        }
	    }
	    return q.size();
		
	}

	public static void main(String[] args) {

        int[] students= {1,1,1,0,0,1};
        
        int[] sandwich= {1,0,0,0,1,1};
        
        countstudents(students, sandwich);

	}

}
