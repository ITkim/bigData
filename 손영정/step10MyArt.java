/*��ǰ ����
 * 1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 * 2. �ݺ�, ���� � ���� ������ �� �� �ִ� �ϳ��� lab ����
 * 3. �� ¦���� �����ϴ� ����
 */

package step01.syntax;

public class step10MyArt {
	
	public static int getAsk(int value) {
		int retVal = 100;  //�⺻�� A �� ���´�. >> �� ������ �� ���� ���ƾ� �ϱ⿡ ������ ���ش�
		if(value <= 1) {
			retVal = 100;
		}else if(value <= 4) {
			retVal = 70;
		}else if(value <= 8) {
			retVal = 40;		
		}else {
			retVal = 0;
		}
		return retVal;
	}
	
		public static void forTest(){
			char shy = '/';
			String shy2 = "";
			for(int i=1; i<=8; i++) {
				System.out.print(">");
				for(int j=1; i+j<=9; j++) {
				System.out.print(shy);
			}
				System.out.println("<");
			}
		}
		
		public static void whileTest() {
			char angry = '^';
			String angry2 = "";
			int no=1;
			System.out.print("�Ѥ�");
			while (no<6) {
				System.out.print(angry);
				no++;
			}
		}
	
		
	public static void main(String[] args) {
		System.out.println("������� �����" +"  " + getAsk(5));
		forTest();
		whileTest();
	}

}
