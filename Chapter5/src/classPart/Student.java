package classPart;

public class Student { // public Ŭ������ �ϳ��� �ڹ� ������ �̸��� ���ƾ� �Ѵ�.
	
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
