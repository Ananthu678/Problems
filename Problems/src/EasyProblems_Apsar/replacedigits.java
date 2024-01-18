package EasyProblems_Apsar;

public class replacedigits {
	
	public static String replacedigits(String s) {
		
		char[] ch = s.toCharArray();
		
		for (int i = 1; i < ch.length; i+=2) {
			ch[i]= (char) (ch[i-1]+ch[i]-'0');
		    System.out.println(ch[i]);
		}
		return new String(ch);
		
	}

	public static void main(String[] args) {
	
		String s="a1c1e1";
		String newstring = replacedigits(s);
		
		System.out.println(newstring);

	}

}
