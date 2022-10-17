package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void washCar() {}
	public void startCar() {
		System.out.println("시동을 켭니다");
		
	}
	public void turnOff() {
		System.out.println("시동을  끕니다");
			
	}
	public final void run() { // final 메서드는 상속받는 클래스에서 재정의 불가 = 템플릿 메서드
		startCar(); 
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
		
	}

}
