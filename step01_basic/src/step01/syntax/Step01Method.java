/* �н�����
 * 1. �޼ҵ� ����(����, �����)
 * 		- ��Ģ���� �������� test
 * 2. �޼ҵ� ȣ��(���)
 * 3. ���� ��ġ
 * 		- class ���� �������� ���� ����
 * 		- �޼ҵ� ���ο� �޼ҵ� ���� �Ұ� 
 * 		- �޼ҵ� ���ο��� �ٸ� �޼ҵ� ȣ�� ���� 
 * 4.�⺻ ����(*)
 * 	- ��ȯŸ�� �޼ҵ��( [arguments] ){ [����] }
 * 	- ��ȯ�� Ÿ�Կ� �°� ��ȯŸ�� ����
 * 	- ��ȯ�� ���� �޼ҵ��� ��� ��ȯ Ÿ�Կ� void�� ����
 * 5. ����
 * 	- �����ڿ� ���� ��
 * 		������ ���� : Ŭ������([arguments] ){ [����] }
 */
package step01.syntax;

public class Step01Method {
	public Step01Method() {}
	public int sum(){
		return 3+5;
	}
	public int sum(int no1, int no2){
		return no1 + no2;
	}
	public void sum(int no1, int no2, int no3){
		System.out.println(no1 + no2 + no3);
	}
	public static void main(String[] args) {
		Step01Method s = new Step01Method();
		int v1 = s.sum();
		System.out.println(v1);
		System.out.println(s.sum(100, 200));
		System.out.println("eee");
		s.sum(3, 5, 6);
	}
}



















