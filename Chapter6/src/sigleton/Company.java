package sigleton;

public class Company {
	
	private static Company instance = new Company();
	
	private Company(){ // �ܺο��� constructor ȣ�� �Ұ�
		
	}
	
	public static Company getInstance() {
		if (instance == null) instance = new Company();
		return instance;
	}
}