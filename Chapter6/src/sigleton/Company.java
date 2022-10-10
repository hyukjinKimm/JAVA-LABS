package sigleton;

public class Company {
	
	private static Company instance = new Company();
	
	private Company(){ // 외부에서 constructor 호출 불가
		
	}
	
	public static Company getInstance() {
		if (instance == null) instance = new Company();
		return instance;
	}
}
