package Day4;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n=123; int reverse=0;
		
		while(n>0) {
			int num=n%10;
			reverse= reverse*10+num;
			n=n/10;
		}
		
		System.out.println(reverse);

	}

}
