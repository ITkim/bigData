/* �н�����
 * 1. ��ü���� ����� ���(����)�Ǵ� ���踦 "has a" ����
 * 2. ����
 * 		has a [�����, ����]
 * 
 * 3. ����
 * 		 - ����� is a[�����, ����] �� ǥ��
 * 		 - �� �Ӽ�(������)���� ������ ��쿡�� ��� ����
 * 		���� : ���� Ŭ������ �� Ŭ���� ������ ��� ���� 
 */
package step02.hasa;

public class HasATest {

	public static void main(String[] args) {
		//String -> Engine -> Car -> Person & String
		/* �� ����� �� ���� Person ��ü ����
		 * ? �����̸�, cc, Person�� �̸��� �� �����Ͻð� ���  */
		Person p1 = new Person();
		Person p2 = new Person();
		
		/* p1.myCar.engine.setEngineName("A����")
		 * p1 - Person ��ü
		 * p1.myCar - Car ��ü 
		 * p1.myCar.engine - Engine ��ü
		 * p1.myCar.engine.setEngineName() - Engine��ü�� �޼ҵ� */
		p1.myCar.engine.setEngineName("A����");
		p1.getMyCar().engine.setCc(10000);
		
		System.out.println(p1.myCar.engine.engineName);
		/* p1.myCar.engine.engineName
		 * A���� �� ������ �߿��� A��� ù ������ char �����͸� ����
		 * ���
		 * 
		 * engineName Ÿ�� String
		 * String Ŭ�������� index������ char�� ��ȯ
		 * String API 	 */
		char v = p1.myCar.engine.engineName.charAt(0);
		System.out.println(v);
		//System.out.println(p1.myCar.engine.engineName.charAt(0));
	}
}










