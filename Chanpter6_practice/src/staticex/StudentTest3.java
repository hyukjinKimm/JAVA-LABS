package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		  Student studentLee = new Student();
		  studentLee.setStudentName("이지원");
		  System.out.println(Student.getSerialNum());
		  System.out.println(studentLee.studentName + "학번:" + studentLee.studentID);
		  
		  Student studentSon = new Student();
		  studentSon.setStudentName("손수경");
		  System.out.println(Student.getSerialNum());
		  System.out.println(studentLee.studentName + "학번:" + studentSon.studentID);
		  
		  
	}

}
