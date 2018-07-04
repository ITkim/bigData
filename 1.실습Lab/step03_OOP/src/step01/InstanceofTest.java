package step01;

public class InstanceofTest {
	
	public static void main(String[] args) {
		//String ��ü�� ���밪 ��
		System.out.println("data".equals("data"));//true
		
		//Integer ��ü�� ���밪 ��
		Integer i = new Integer("3");
		Integer i2 = new Integer("33");
		System.out.println(i.equals(i2));//false
		//���� �ٸ� Ÿ���̱� �ϳ� equals()�� parameter�� Object
		/* java.lang.Object�� ��� ��ü Ÿ���� �ֻ���
		 * �⺻ Ÿ�� 8������ ������ ��� Ÿ�� �� ���� ����	 
		 * ������ Ÿ��
		 * 	1. �⺻ Ÿ��
		 * 		- ����,�Ǽ�,����,��
		 * 2. ���� Ÿ��
		 * 		- �⺻ ������ ��� Ÿ��
		 * */
		System.out.println(i.equals("���ڿ�"));//false
		
		//1
		System.out.println(i.equals("3"));//false
		//2
		System.out.println("3".equals(i));//false
		//����� ���� ��ü�� ���밪 ��
		
		
		//Object�� �ڽ� String, Integer,...
		/* * ��ü Ÿ�� �� ������
		 * 1. instanceof
		 * 2. �������� : ��� ���迡���� �� ����	 */
		System.out.println("string" instanceof Object);//true
		System.out.println("string" instanceof String);//t
		//String�� Integer�� ��� ���谡 �ƴ� ���� �� �Ұ�
		//	System.out.println("string" instanceof Integer);//t
		
		System.out.println("---- ������ ");
		AA a = new AA(5);
		AA a2 = new AA(15);
		System.out.println(a.equals(a2));//true
	}
}
class AA extends Object{
	int data;
	AA(){}
	AA(int d){
		data = d;
	}
	//��ü�� �ּҰ� ���ߴ� �޼ҵ带 ���밪(������) �񱳷� ������
	/* AA ��ü�� ��
	 * 1. AA Ÿ�� ���� �� - instanceof
	 * 2. AA Ÿ���� ��ġ�ȴٸ� AA��ü���� ������ 
	 * 		��� ������ ��
	 * 		Object Ÿ���� ������ ��ӽ�Ų �޼ҵ常 ȣ��
	 * 		�ڽĸ��� ����� ȣ���ϱ� ���ؼ��� ����ȯ �ʼ�  */
	public boolean equals(Object o) {
		if(o instanceof AA) {
			AA a = (AA)o;//data ��� ���� �񱳸� ���� ����ȯ
			
			//�� �޼ҵ带 ������ ��ü�� data ������
			//parameter�� ���Ե� ��ü�� data ���� ��
			if(data == a.data) {
				return true;
			}
		}
		return false;
	}

}






