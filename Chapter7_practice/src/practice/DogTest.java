package practice;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		ArrayList<Dog> arr = new ArrayList<Dog>();
		for (int i = 0; i < 5; i ++) {
			Dog dog = new Dog("이름", "타입");
			arr.add(dog);
		}
		for(Dog dog: arr) {
			System.out.println( dog.showDogInfo());
		}
	}

}
