package EasyProblems_Apsar;

public class Excelsheel_column_name_find {
	
	public static void ExcelColumnTitle(int columnNumber) {
		
		StringBuilder sb= new StringBuilder();
		
		while(columnNumber>0) {
			int rem = columnNumber%26;
			if(rem==0) {
				sb.append("Z");
				columnNumber=columnNumber/26-1;
			}
			
			else {
				sb.append((char)((rem-1)+ 'A'));
			    columnNumber=columnNumber/26;
			}
			
		}
		
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) {

         ExcelColumnTitle(104);

	}

}
