package interfaceex;

public interface Calc {
	
	double PI = 3.14; // 아무런 키워드를 쓰지않아도 public static final 이다 
	int ERROR = -999999;
	

	int add(int num1, int num2); // interface 안에서는 public abstract 자동으로 붙여진다
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
