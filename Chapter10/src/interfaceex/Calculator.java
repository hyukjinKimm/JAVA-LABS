package interfaceex;

public abstract class Calculator implements Calc{ //   �Լ��� ���� �������� ������  abstract class �� �ȴ�.

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}


}
