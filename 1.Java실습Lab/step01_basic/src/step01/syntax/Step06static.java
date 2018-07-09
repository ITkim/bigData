/* �н�����
 * 1. static Ű���� 
 * 2. ���� ����
 * 		1. ��� ���� ����
 * 			- �����Ǵ� ��� ��ü���� �����ϴ� ����
 * 				: ���� �ڿ��� �ƴ� �����鿡 ��� ����
 * 			- static ������ �޸𸮿� ���� ��� �����ϰ� 
 * 			  �����Ǵ� ������?
 * 				: ���� �ڵ��� byte code�� �޸𸮿� 
 * 				  �ε�(����)�ɶ� �ڵ� ����
 * 			
 * 		2. �޼ҵ� ���� 
 * 			- ��ü �������� Ŭ���������� �޼ҵ� ȣ�� ����
 * 		3. static{}
 * 			- web server�� ���۵ɶ� ��� user�� �����ϴ� 
 * 			  �ڿ��� �ִٸ� �� �ѹ� ���� ������ �Ҽ� �ִ� ����
 * 			  �̸��� ���� ���� �ڵ�� ȣ�� �Ұ�
 * 			- byte code�� �޸𸮿� �ε��ɶ� �ڵ� ���� 
 */
package step01.syntax;

public class Step06static {
	//step02 - static ����
	static int no = 100;
	static String msg = "���ڿ�";
	
	//instance ����
	int no2 = 200;
	String msg2 = "���ڿ� 2";
	
	void m1() {
		System.out.println("�Ϲ� �޼ҵ�");
	}
	//��ü �������̵� class��.m2() �Ǵ� ������ Ŭ������� m2(); ȣ�� ����
	static void m2() { 
		System.out.println("static �޼ҵ�");
	}
	//>java Step06static       Step06static.main();
	public static void main(String [] args) {
		m2();
		Step06static.m2();
		
		Step06static s = new Step06static();
		System.out.println(s.no2);
		
		System.out.println(no);//100
		System.out.println(msg);//���ڿ�
		
		System.out.println(Math.random());
		
		//java.lang.Integer�� �޼ҵ� ȣ��
		//"3" -> int�� ��ȯ�ϴ� �޼ҵ� ȣ���ؼ� ��ȯ�ϱ�
		/* �ʿ��� ������ - int�� ������ ���ڿ� ������
		 * ��� ������ - int�� ��ȯ�� ������
		 * 
		 * �� ������ � Ŭ�������� ������ ���ΰ�?
		 * 		String? Integer?
		 * 		Ȥ ���ڿ� �����͸� ������ �޼ҵ带 ������ ��ü�� �ʿ��Ѱ�?
		 * 
		 *byte : Byte 
		 *		- public static byte parseByte(String v){}
		 */
		int no3 = Integer.parseInt("3");
		System.out.println(no3);
	}
	
	//step01 - static{}
	/*static {
		System.out.println(1);
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
	static {
		System.out.println(2);
	}*/

}
