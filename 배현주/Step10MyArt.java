/* ��ǰ ����
 * 1. ���� ��� ���뿡 ���� 2~3���� �޼ҵ带 ����
 * 2. �ݺ�, ���� � ���� ������ �� �� �ִ� �ϳ��� lab����
 * 3. ����: �� ¦���� �����ϴ� ����...
 */


package step01.syntax;

public class Step10MyArt {
	//�޼ҵ� 1 , ���� �ð��� ���� ������ �ο��� ���� ¦���� �ൿ ����
	public static String getRest(int people) {
		String retPeo = "cigarettes";
		
		if( people >=4) {
			retPeo ="cigarettes";
		
		} else if (people>=2) {
			retPeo= "water";
		
		} else {
			retPeo= "toliet";
		}
		return retPeo;		
	}
	//�޼ҵ� 2 , �� �����ϱ�
	public static void forTest1() {
		char star='*';
		for(int lineCount = 1; lineCount <=5; lineCount++ ) {
			for(int starCount=5; starCount>=lineCount; starCount--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
	//�޼ҵ� 3, 1,2��° ���� *, 3~5��°�� # ���
	public static void whileTest() {
		int no =1; 
		while(no<6) { 
			char star='*';
			char star2='#';
			
			if(no>=4) {
				System.out.println(star);
				
			} else if (no<4) {
				System.out.println(star2);
			
						}
			no++; 
		}
	}
	public static void main(String[] args) {
		System.out.println(getRest(5));
		System.out.println(getRest(2));
		System.out.println(getRest(1));
		forTest1();
		whileTest();
	}

}
