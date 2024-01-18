package Strings;

public class first_unique_string {
	
	 public static void firstUniqChar(String s) {
	        
         int MAX_CHAR=26;

         int[] letters=new int[MAX_CHAR];

         for(char x : s.toCharArray()){
             letters[x - 'a']++;
         }
        
        for(int i=0; i<MAX_CHAR; i++){
            if(letters[i]==1) {
               System.out.println("the first unique character is :" + (char)(i+'a'));
               break;
            }
        }
       
   }

	public static void main(String[] args) {

		 String s="geeksforgeeks";
		 firstUniqChar(s);
		 
	}

}
