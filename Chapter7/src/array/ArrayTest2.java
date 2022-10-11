package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] num = new double[5];
		
		double tot = 0;
		
		int size = 0;
		num[0] = 1; size++;
		num[1] = 2; size++;
		num[2] = 3; size++;
		
		for(int i = 0 ; i < num.length ; i ++) {
			tot += num[i];
		}
		System.out.println(tot);
		
	}

}
