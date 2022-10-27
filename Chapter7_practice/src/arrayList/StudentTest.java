package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		Subject subject = new Subject();
	  
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "kim");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 40);
		studentLee.addSubject("영어", 40);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		
	}

}
