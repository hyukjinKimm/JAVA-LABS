package interfaceex;

public interface Calc {
	
	double PI = 3.14; // �ƹ��� Ű���带 �����ʾƵ� public static final �̴� 
	int ERROR = -999999;
	

	int add(int num1, int num2); // interface �ȿ����� public abstract �ڵ����� �ٿ�����
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
