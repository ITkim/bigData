/* ��ǰ ����
 * 	1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 * 2. �ݺ�, ���� � ���� ������ �� �� �ִ� �ϳ��� lab ����
 * 3. ���� : �� ¦���� �����ϴ� ����...
 */

package step01.syntax;

import java.util.Date;

public class Step10MyArt {

	public static String timeclassify(int hr) {
		String Hr = "���½ð�";
		if (hr >= 7 && hr <= 9) {
			Hr = "��ð�";
		} else if (hr >= 9 & hr <= 11 || hr >= 13 & hr <= 18) {
			Hr = "�����ð�";
		} else if (hr >= 12  & hr <= 13) {
			Hr = "���ɽð�";
		} else if (hr >= 19 & hr <= 22) {
			Hr = "ġ�ƽð�";
		} else {
			Hr = "���½ð�";
		}
		return Hr;
	}
	
	public static void makeStar() {
		String star = "*";
		for(int l=1; l<= 5; l ++) {
			if (l==1) {
			star = "   *   ";
			} else if (l==2) {
			star = "  **  ";
			} else if (l==3) {
			star = "*****";
			} else if (l==4) {
			star = " *** ";
			} else if (l==5) {
			star = " *  * ";
			}
		System.out.println(star);
			}
		}
	
	public static void main(String[] args) {
		Date date = new Date();		
		System.out.println("������ �����ð�? ���� �ð��� ���缭 ������Ʈ��");
		System.out.println("������ " + timeclassify(date.getHours()));
		System.out.println("\n"+"���� ������");
		makeStar();
	}

}
