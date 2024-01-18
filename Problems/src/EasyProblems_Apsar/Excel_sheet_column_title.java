package EasyProblems_Apsar;

public class Excel_sheet_column_title {
	
	public static int titleToNumber(String columnTitle) {
		
		int result=0;
		for(int i=0;i<columnTitle.length();i++) {
			result*=26;
			result+= (columnTitle.charAt(i)-'A')+1;
		}
		return result;
		
	}

	public static void main(String[] args) {

        String columnTitle="CZ";
        int output = titleToNumber(columnTitle);
        System.out.println(output);

	}

}
