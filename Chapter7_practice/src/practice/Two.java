package practice;

public class Two {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
	int j = 0;
	for (int i = 1 ; i < 11; i ++) {
		if (i % 2 == 0) {
			arr[j] = i;
			j ++;
		}
	  }
	for (int i = 0 ; i < 5; i ++) {
		System.out.println(arr[i]);
		
	  }
	}

}
