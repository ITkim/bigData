/* ��ǰ ����
 * 1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 * 2. �ݺ�, ���ǵ ���� ������ �� �� �ִ� �ϳ��� lab ����  
 * 3. ����
 */
package step01.syntax;

public class Step10MyArt {
	
	public static String getConc(int value) {
		
		String Accept="����.";
		if(value>=65) {
			Accept="����.";
		}else { Accept="������.";
				}
		return Accept;
	}

	public static String getHealth(int value2) {
		
		String Good="û��ȣ.";
		if(value2>=70) {
			Good="û��ȣ.";
		}else if(value2>=55) {
			Good="Ȳ��ȣ.";
		}else {
			Good="����ȣ.";
		}
		return Good;
	}
	
	public static void cryList(int value, int value2, int list) {
			System.out.println(list + "�� ȯ��");
			System.out.print("����� :" + " "+ getConc(value));
			System.out.print("  ���� ���� ��� :" + " " + getHealth(value2));
			
	}

	public static void cryRemark(String human, String sign) {
		if(human=="����" && sign=="û��ȣ") {
			System.out.println("***�� ȯ�ں��� �Ͱ���ġ �Ͻñ� �ٶ��ϴ�.");
		}else if(human=="����" && sign=="����ȣ") {
			System.out.println("***�� ȯ�ں��� ġ�Ḧ ���� �Կ��� �����մϴ�.");
		}else if(human=="����" && sign=="Ȳ��ȣ") {
			System.out.println("***�� ȯ�ں��� �Ǿ�ǰ ó�� �� �Ͱ� ��ġ �Ͻñ� �ٶ��ϴ�.");
		}else {
			System.out.println("\n***4�ð� �� �� ������ �����Ͻʽÿ�.");
		}
	}
	
	public static void main(String[] args) {
		
		cryList(64,35,666);
		cryRemark("������","����ȣ");
	}

}
