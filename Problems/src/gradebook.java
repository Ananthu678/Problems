import java.util.HashMap;
import java.util.Map;

public class gradebook {
	
public static Map getMakeupGrade1() {
		
		Map grades=new HashMap();
		grades.put("Ananthu", 100);
		grades.put("karunya", 99);
		grades.put("Hayaan", 97);
		grades.put("Siva", 99);
		grades.put("bala", 100);
		return grades;
	}
	
	public static Map getOriginalGrade() {
		
		Map grades=new HashMap();
		grades.put("Ananthu", 99);
		grades.put("karunya", 98);
		grades.put("Hayaan", 99);
		grades.put("Siva", 89);
		grades.put("bala", 100);
		return grades;
	}
	
	

	public static void main(String[] args) {
		
		Map<String, Integer> originalGrade =getOriginalGrade();
		Map<String, Integer> makeupGrade=getMakeupGrade1();
		
		originalGrade.forEach( (student, orignalgrade) -> {
			Integer makeupgrade= makeupGrade.get(student);
			if(makeupgrade > orignalgrade) {
				originalGrade.put(student, makeupgrade);
			}
			System.out.println(student + ":" + originalGrade.get(student));
		});
		
		
		

	}

}
