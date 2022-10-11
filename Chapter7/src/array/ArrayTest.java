package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] number = new int[] {0, 1, 2};
		int[] number2 = {0, 1, 2};
		System.out.println(number.length);
		
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		for(int i = 0; i < number.length ; i ++) {
			System.out.println(number[i]);
		}
		
		int[] number3 = new int[5];
		for(int i = 0; i < number3.length ; i ++) {
			System.out.println(number3[i]);
		}
		
	}

}
