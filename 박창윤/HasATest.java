/*�н�����
 * 1. ��ü ���� ����� ���(����)�Ǵ� ���¸� "has a"����
 * 2. ����
 * 		has a [�����, ����]
 * 3. ����
 * 		- ����� is a[�����,����]�� ǥ��
 * 		- �� �Ӽ�(������)���� ������ ��쿡�� ��� ����
 * 		���� : ���� Ŭ������ �� Ŭ���� ������ ��� ����
 * 
 */
package step02.hasa;

public class HasATest {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Car c = p1.myCar;
		Engine e = c.engine;
		
		e.EngineName="���� �Ŀ� ����";
		e.cc=200;
		
		p1.name="������";
		p2.name="Ʈ����";
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p1.myCar.engine.getEngineName());
		System.out.println(e.getEngineName());
		
		
		
		System.out.println("----����� ���-----");
		/*p1.myCar.engine.setEngineName("A")
		 *p1 - person ��ü
		 *p1.myCar - myCar ��ü
		 *p1.myCar.engine - Engine ��ü
		 *p1.myCar.engine.setEngineName("A") 
		 * */
		System.out.println(p1.myCar.engine.setEngineName("AŬ��"));
		
		
		
		//String -> Engine -> Car -> Person & String
		/*�λ���� �� ���� Person ��ü ����
		 * �����̸�, cc, Person�� �̸��� �� �����Ͻð� ���
		 */
		

	}

}
