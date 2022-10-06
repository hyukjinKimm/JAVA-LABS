package classPart;

public class Student { // public 클래스는 하나고 자바 파일의 이름과 같아야 한다.
	
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}
	public String getStudentName() {
	  return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}

}
