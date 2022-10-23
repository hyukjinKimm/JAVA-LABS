package practice;

public class Person {
	int money;
	
	public Person(int money) {
		this.money = money;
	}
	public void star_buy(Star star) {
		star.buy(1000);
		this.money -= 1000;
	}
	
	public void cong_buy(Cong cong) {
		cong.buy(1500);
		this.money -= 1500;
	}
}

