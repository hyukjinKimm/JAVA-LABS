package interfaceex;

public abstract class Calculator implements Calc{ //   함수를 전부 구현하지 않으면  abstract class 가 된다.

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
