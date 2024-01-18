package EasyProblems_Apsar;

public class ShuffleString {
	
	public static String shufflestring(String s, int indices[]) {
		
		char ch[]= new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			ch[indices[i]]=s.charAt(i);
		}
		
		String s1=new String(ch);
		return s1;
		
	}

	public static void main(String[] args) {

         String s ="codeleet";
         int indices[]= {4,5,6,7,0,2,1,3};
         
         String result =shufflestring(s,indices);
         System.out.println(result);

	}

}
