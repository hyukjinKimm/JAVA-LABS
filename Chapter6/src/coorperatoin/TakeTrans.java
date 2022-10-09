package coorperatoin;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student james = new Student("james", 5000);
		Student tomas = new Student("tomas", 10000);
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		
		james.showInfo();
		bus100.showInfo();
		  
	}

}
