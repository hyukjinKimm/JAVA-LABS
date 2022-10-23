package practice;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(10000);
		Person p2 = new Person(10000);
		
		Star star = new Star();
		Cong cong = new Cong();
		p1.star_buy(star);
		p2.cong_buy(cong);
		
		System.out.println(p1.money);
		System.out.println(p2.money);
		
		System.out.println(star.money);
		System.out.println(cong.money);
		
		
	}

}
