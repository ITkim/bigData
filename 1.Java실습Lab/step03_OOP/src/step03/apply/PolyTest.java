//������ �ͼ��� ���� 
package step03.apply;

public class PolyTest extends Object{

	public PolyTest() {
		super();
	}
	
	//���ڿ� ��ü ������ Object(�ֻ���) Ÿ������ ��ȯ
	//Object ���� = "���ڿ�";�� ��
	public static Object getData() {
		return "���ڿ�";//String ��ü ���� -> ��ȯ
	}
	public String toString() {
		return "��";
	}
	public static void main(String[] args) {
		PolyTest p = new PolyTest();
		System.out.println(p);
		System.out.println(p.toString());
		
		String data = (String)getData();
		System.out.println(data);
		System.out.println(data.toString());
		
		Integer i = new Integer(33);
		System.out.println(i);
		System.out.println(i.toString());
		
		System.out.println(data.charAt(0));
		
		//���� : Object �� ��ӽ�Ű�� ���� ����, �޼ҵ�� Object
		//Ÿ���� access(ȣ��) �Ұ�
		//���� ���� : getData() -> getData().charAt(0) -> (String)
		//System.out.println((String)getData().charAt(0));
		
		System.out.println(( (String)getData() ).charAt(0));
	}

}




