package sigleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company n1 = Company.getInstance();
		Company n2 = Company.getInstance();
		
		System.out.println(n1);
		System.out.println(n2);
		
	}

}
