/* ��ǰ ����
 * 1. ���� ��� ���뿡 ���ؼ� 2~3���� �޼ҵ带 ����
 * 2. �ݺ�, ���ǵ ���� ������ �ɼ� �ִ� �ϳ��� lab ����
 * 3. ���� : �� ¦���� �����ϴ� ����
 * 
*/

package step01.syntax;

public class Step10MyArt {
	public static void a(int sleep) {
		if(sleep<=4) {
			System.out.println("���� �����մϴ�.");
		}
		else if(sleep<10) {
			System.out.println("���� ����մϴ�");
		}
		else {
			System.out.println("���� �ٿ����մϴ�");
		}
	}
	public static void b() {
		System.out.println("������:");
		for(int i=1;i <=9; i++) {
			for(int j=1;j <=9;j++) {
				System.out.print(i+" * "+j+"="+(i*j)+"\t");
				}
			System.out.println();
			}
	}
	public static void c() {
		System.out.println("� ���� �����ϱ� ���ؼ��� ��������� ȸ���̻��� ����� �ʿ��ϴ�");
		int study=0;
		for(int lecture=1; lecture<10; lecture++) {
			while(study<10) {
				study++;
				if(lecture+study>10) {
					System.out.println("����ȸ�� : "+lecture+"����ȸ�� : "+study+"\n������ ��ŭ ����� �Ͽ���.");
					}
				else{
									
					}
				}
			study=0;
			}
	}

	public static void main(String[] args) {
		a(8);
		System.out.println("------------------------------------");
		b();
		System.out.println("------------------------------------");
		b();

		
		
	}

}
