package EasyProblems_Apsar;

import java.util.Stack;

public class remove_outer_parantheses {
	
	public static String removeouterParantheses(String s) {
		
		 Stack<Character> stack = new Stack<>();
	        StringBuilder sb = new StringBuilder("");
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='('){
	                if(stack.size()>0){
	                    sb.append(s.charAt(i));
	                }
	                stack.push(s.charAt(i));
	            }else{
	                stack.pop();
	                if(stack.size()>0){
	                    sb.append(s.charAt(i));
	                }
	            }
	        }
	        return sb.toString();
		
	}

	public static void main(String[] args) {

        String s="(()())(())";
        System.out.println(removeouterParantheses(s));

	}

}
