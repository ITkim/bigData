package step01.test;

public class Test {
	String message;//����
	int age;//����
	
	public Test() {}//������
	public Test(String m, int a) {
		message = m;
		age = a;
	}
	//? ��ü �������� message, age ��� ������ ����� �ֳ���?
	//����
	public static void main(String[] args) {
		Test t = new Test("������ �� ���׿�", 46);
		System.out.println(t.message);
		System.out.println(t.age);
	}
}
/* 
 * 1. ������ ���� �ڵ� �߰��Ǵ� �ڵ��?
 * 		public Test() {}
 * 2. "������ �� ���׿�"..��� �����͸� �����Ҽ� �ִ�
 *    ������ ����
 * 3. 46 �̶�� ���� ���� ������ ���� ����
 * 4. ��ü ���� ������ �������� �����ͷ� ������ ����
 * 	    �Ҽ� �ִ� parameter(argument,�Ű�����)�� �ִ� 
 *    ������ �����
 * 5. "������ �� ���׿�", 46�̶�� �����ͷ� 
 * 		��ü ���� �� ������ ����ϱ�
 * ��Ʈ : ��ü ���� ����
 * 		Ÿ�� ������ = new ������ȣ��(..);
*/





