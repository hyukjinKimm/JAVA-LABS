package gameLevel;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("뻘리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프 합니다");
	}

	@Override
	public void turn() {
		System.out.println("턴 할줄 모르지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****중급자 레벨입니다.*****");
	}

}
