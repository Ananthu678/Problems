package Day2;

public class GFG {
	
	public static boolean isAlphabetic1(char c) {
		return (c >='A' && c<='Z' || c>='a' && c<='z' || c>='0' && c<='9');
	}
	
	public static void reverse(char str[])
    {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;
 
        // Traverse string from both ends until 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!isAlphabetic1(str[l]))
                l++;
            else if (!isAlphabetic1(str[r]))
                r--;
 
            // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();
 
        System.out.println("Input string: " + str);
        reverse(charArray);
        String revStr = new String(charArray);
 
        System.out.println("Output string: " + revStr);
    }

}
