package classpart;

public class StudentTest {

	  public static void main(String[] args) {
		  Student studentAhn = new Student();
		  studentAhn.studentName = "�ȿ���";
		  System.out.println(studentAhn.getStudentName());
		  
		  Student studentKim = new Student();
		  studentKim.studentName = "������";
		  System.out.println(studentKim.getStudentName());
		  
		  System.out.println(studentAhn);
		  System.out.println(studentKim);
		  
	  }

}
