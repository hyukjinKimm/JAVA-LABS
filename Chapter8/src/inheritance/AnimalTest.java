package inheritance;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");		
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
	public void hunt() {
		System.out.println("ȣ���̰�  ����մϴ�.");		
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		
		//Animal a = new Human();
		
	}
	public void moveAnimal(Animal animal) {
		animal.move();
		
		if (animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunt();
		} else {
			System.out.println("�������� �ʴ� ��� �Դϴ�.");
		}
	}

}
