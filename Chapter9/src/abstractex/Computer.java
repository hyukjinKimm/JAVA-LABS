package abstractex;

public abstract class Computer { // �߻� �޼��带 �������� �߻�Ŭ���� ������ ( �߻�Ŭ������ �ν��Ͻ�ȭ �ɼ����� ��Ӹ� �� �� �ִ�)

  public abstract void display(); // �޼��带 ���� �Ѵ� (��ӹ޴� Ŭ�������� body �� ����)
  public abstract void typing(); // �����ڵ尡 ������ �߻�޼���
  

  public void turnOn() {
	  System.out.println("������ �մϴ�.");
  }
  public void turnOff() {
	  System.out.println("������ ���ϴ�.");
  }  
 
}
