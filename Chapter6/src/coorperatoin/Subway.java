package coorperatoin;

public class Subway {
	  int lineNumber;
	  int money;
	  int passengetCount;
	  
	  public Subway(int lineNumber) {
		  this.lineNumber  = lineNumber;
	  }
	  public void take(int money) {
		  passengetCount += 1;
		  this.money += money;
	  }
	  
	  public void showInfo() {
		  System.out.println("ȣ�� : " + lineNumber + "�°� �� : "+ passengetCount + " ����: " + money);
	  }
}
