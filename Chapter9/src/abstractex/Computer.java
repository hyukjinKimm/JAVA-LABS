package abstractex;

public abstract class Computer { // 추상 메서드를 가질려면 추상클래스 여야함 ( 추상클래스는 인스턴스화 될수없고 상속만 될 수 있다)

  public abstract void display(); // 메서드를 선언만 한다 (상속받는 클래스에서 body 를 구현)
  public abstract void typing(); // 구현코드가 없으면 추상메서드
  

  public void turnOn() {
	  System.out.println("전원을 켭니다.");
  }
  public void turnOff() {
	  System.out.println("전원을 끕니다.");
  }  
 
}
