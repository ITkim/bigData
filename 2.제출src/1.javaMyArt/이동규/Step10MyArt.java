/*
 * ��ǰ ����
 * 1. ���� ��� ���뿡 ���ؼ� 2~3���� �޼ҵ带 ����
 * 2. �ݺ�, ���� � ���� ������ �� �� �ִ� �ϳ��� lab ����
 * 3. ���� : �� ¦���� �����ϴ� ����...
 * 
 * ���� : ������ �� �ǰ����� ������Ʈ
 * 
 * ���� 1,3,5,7,9�� ��(Ȧ����)���� �ش� ������ŭ �� ����, ¦���� (2,4,6,8,0)�� �� �Ұ�.
 * ��, �ָ��� �����Ӱ� �� ����
 * 
 * ���� ¦���ϰ� Ȧ������ ���θ޼ҵ� ���� ���Ӱ� ����� �� argument���� �޾Ƶ鿴�� �� 
 * 
 */

package step01.syntax;

public class Step10MyArt {
	
	
	
	public static void smokeDays() {				
		for (int i =0; i<=30; i++) {
			
			int sunday = 7*i +3;
			int saturday = 7*i+2;
			int smoke = 2*i+2;
			int nonsmoke = 2*i+1;
			
			String ycs = "Smoke Free Boy!!";
			String nosmke = "Don't Smoke Today Boy!!";
			String ycsn = "���� ��¥ ù�ڸ� ���ڸ�ŭ �ǿ�� �� �־��";//�̰� ���� ���α׷������� �ڵ�ȭ ���ϳ�
			
			if (sunday==3 || sunday== 10 ||  sunday==17 || sunday==24||saturday==2||saturday==9||saturday==16||saturday==23||saturday==30) 
			{System.out.println(i+"����"+"����!" + ycs);}
			else {i+"����"+
				}
			else if(smoke) {
				System.out.println(i+"����"+ nosmke );
				}
		}
	

	public static void main(String[] args) {
			smokeDays();
		}	
	
	}

}
