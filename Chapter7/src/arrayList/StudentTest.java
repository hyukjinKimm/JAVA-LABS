package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student studentlee = new Student(1001, "lee");
		studentlee.addSubject("����", 60);
		studentlee.addSubject("����", 70);
		studentlee.showStudentInfo();
	}

}
