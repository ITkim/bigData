/*��ǰ ����
 *  1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 *  2. �ݺ�, ���ǵ ���� ������ �� �� �ִ� �ϳ��� lab ����
 *  3. ����: �� ¦���� �����ϴ� ����... 
 */ 
package step01.syntax;

public class Step10MyArt {

	public static void height1(int height) {
	
		if (height >= 190) {
			System.out.println("Big guy");
		} else if (height >= 180) {
			System.out.println("Cool guy");
		} else if (height >= 170) {
			System.out.println("Nice guy");
		} else if (height >= 160) {
			System.out.println("Good guy");
		} else {
			System.out.println("Angel");
		}
	}	

	public static void main(String[] args) {
		height1(158);
		 
		}}
