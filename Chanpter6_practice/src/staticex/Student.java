package staticex;

/**
 * @author 김혁진
 *
 */
public class Student {
    private static int serialNum = 1000;
	public int studentID;
	public String studentName; 
	public int grade;
	public String address;
	public int cardNum;
	public Student() {
		serialNum ++;
		studentID = serialNum;
		cardNum = serialNum + 100;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}
