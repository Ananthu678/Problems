package Strings;

public class Test {

	public static void process(String mystring) {
		StringBuilder sb = new StringBuilder();
		char[] mychar = mystring.toCharArray();
		int count = 1; int n=mychar.length-1;
		for(int i=0; i< n;i++) {
		if(mychar[i] == mychar[i+1]) {
		count = count+1;
		}
		else {
		sb.append(mychar[i]);
		sb.append(count);
		count = 1;
		}
		if(i==n-2) {
		sb.append(mychar[i+1]);
		sb.append(count);
		}
		}
		System.out.println(sb.toString());
		}

		public static void main(String[] args) {
		process("aabbbccccaaa");
		/*
		 * process("ggggyyynnnkkkkkk"); process("aabbcccdef"); process("abcdefghj");
		 */
		}


}
