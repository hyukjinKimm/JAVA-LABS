package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// �ν��Ͻ�ȭ �Ұ� Computer c1 = new Computer();
		Computer c2 = new Desktop();
		Computer c3 = new MyNoteBook();		
		NoteBook c4 = new MyNoteBook();
		
		c4.aaa();
		
		c2.display();
		c3.display();
	}
}
