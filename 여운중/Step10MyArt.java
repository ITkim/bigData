/* ��ǰ ����
 * 1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 * 2. �ݺ�, ���ǵ ���� ������ �ɼ� �ִ� �ϳ��� lab ����
 * 
 * */
//1
package step01.syntax;

public class Step10MyArt {

	public static String job(double value) {
		String retVal = "AA";
		if(value >= 4) {
			retVal = "���";
		}else if(value >= 3) {
			retVal = "�������";
		}else if(value >= 2) {
			retVal = "�ɰ���";
		}else {
			retVal ="���� â�� ��õ";
		}
		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(job(1.4));
		
		
	}

}
	
