package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentMary = new Student("Mary", 10000);
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGareen = new Subway(2);
		studentTomas.takeSubway(subwayGareen);
		studentTomas.showInfo();
		subwayGareen.showInfo();
		
		Taxi taxi = new Taxi(3232);
		studentMary.takeTaxi(taxi);
		studentMary.showInfo();
		taxi.showInfo();
		
		
	}

}
