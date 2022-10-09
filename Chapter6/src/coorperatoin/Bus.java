package coorperatoin;

public class Bus {
  int busNumber;
  int money;
  int passengetCount;
  
  public Bus(int busNumber) {
	  this.busNumber  = busNumber;
  }
  public void take(int money) {
	  passengetCount += 1;
	  this.money += money;
  }
  
  public void showInfo() {
	  System.out.println("¹ö½º : " + busNumber + "½Â°´ ¼ö : "+ passengetCount + " ¼öÀÍ: " + money);
  }
}
