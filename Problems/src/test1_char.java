
public class test1_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch[]=new char[5];
		ch[0]='a';
		ch[1]=1;
		ch[2]='c';
		ch[3]=1;

for (int i = 1; i < 5; i++) {
	   ch[i]=(char) (ch[i-1]+ch[i] - '0');
	   System.out.println(ch[i]);
}
		

	}
}
