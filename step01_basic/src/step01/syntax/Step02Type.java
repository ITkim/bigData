/* �н� ����
 * 1. �⺻ syntax ����
 * 2. ���� ����(����), ���� �ʱ�ȭ(�� ����)
 *     �޼ҵ� ����(����), �޼ҵ� ȣ��
 *     ������ ����, ������ ȣ��
 * 3. �� ���� ����� �뵵
 * 		1. ���� - ������ ǥ��
 *     2. �޼ҵ� - �پ��� ó�� ��� ����
 *     		 ��ȯŸ�� �޼ҵ��( [] ){[..]}
 *     3. ������ - ��ü ������ ȣ��Ǵ� �ʼ� ���� ���
 */
package step01.syntax;

public class Step02Type {
	//Ȳ�ι�, 27
	String name;
	int age;
	public Step02Type() {}//�⺻ ������
	
	//Step02Type ��ü ��ȯ �޼ҵ� 
	Step02Type getObject() {
		Step02Type s = new Step02Type();//��ü ���� ����
		return s;
	}
	Step02Type getObject2() {
		return new Step02Type();
	}
	public static void main(String[] args) {
		//step02 - �޼ҵ� ȣ���ؼ� ��ü �޾ƿ���
		//Ŭ���� ���� �����ϴ� ����, �޼ҵ���� ���� �����ϱ� ���ؼ���
		//�ݵ�� ����, �޼ҵ带 ������ ��ü ������ �켱
		//? getObject() ȣ���غ���
		Step02Type s2 = new Step02Type();//s2�� 0x�� ����
		Step02Type v = s2.getObject();//v�� 0x�ּҰ�? 0x�� �ƴұ��?
		
		System.out.println(s2);
		System.out.println(v.age);
		
		
		//����� ������ �� ������ ����, ȭ�� �ܼ�â�� ���
		/* 1. ��ü ���� - new ������()
		 * 2. ������ ��ü�� �����ϴ� ������ ȣ���ؼ�
		 *    ������ name,age ������ ���� ����
		 * 3. �� ������ ȣ���ؼ� ���   */
		//step01
		/*Step02Type s = new Step02Type();
		s.name = "Ȳ�ι�";
		s.age = 27;
		System.out.print(s.name);
		System.out.println(s.age);*/
	}

}






