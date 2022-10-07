package reference;

public class StudentTest {

	public static void main(String[] args) {
		// ÇÑ±Û
		// TODO Auto-generated method stub
		Student james = new Student(100, "tomas");
		james.setKorea(100);
		james.setMath(90);
	
		Student tomas = new Student(100, "tomas");
		tomas.setKorea(80);
		tomas.setMath( 60);
		
		james.showStudentInfo();
		tomas.showStudentInfo();
	}

}
