/*
 *  �н�����
 *  1. ��ü���� ����� ���(����)�Ǵ� ���踦 "has a" ������ �Ѵ�.
 *  2. 
 *  3. ����
 *  	- ����� is a �� ǥ��
 *   	- �� �Ӽ�(������)���� ������ ��쿡�� ��� ����
 *   	���� : ���� Ŭ������ �� Ŭ���� ������ ��� ����
 */


package step02.hasa;

public class HasATest extends Person{

	public static void main(String[] args) {
		//String -> Engine -> Car -> Person & String
		/*
		 * �λ���� �� ���� Person ��ü ����
		 * ? �����̸�, cc, Person�� �̸��� �� �����Ͻð� ���
		 */
		/* =====================================*/
		Person p1 = new Person();
		Person p2 = new Person();
		/* =====================================*/ 
		System.out.println("===Person 1�� Car ����===");
		p1.printEngineName();
		p1.printCC();
		p1.printName();
		/* =====================================*/
		p2.setEngineName("�Ŀ�����2");  //�����̸�, CC, Person�� �̸� ����
		p2.setCc(5000);
		p2.setName("��泲");
		/* =====================================*/
		System.out.println("===Person 2�� Car ����===");
		System.out.println(p2.getEngineName());
		System.out.println(p2.getCc());
		System.out.println(p2.getName());
		/* =====================================*/
		p2.printEngineName();
		p2.printCC();
		p2.printName();
	}
}
