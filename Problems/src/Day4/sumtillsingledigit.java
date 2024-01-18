package Day4;

public class sumtillsingledigit {
	
	

	public static void main(String[] args) {
		
		int n=3457;
		int sum=0;
		
		while(n>0 || sum>9) {
			
			if(n==0) {
				n=sum;
				sum=0;
			}
			
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		
		System.out.println(sum);
	}

}
