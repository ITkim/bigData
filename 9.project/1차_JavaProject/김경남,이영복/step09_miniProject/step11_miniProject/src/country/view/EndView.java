package country.view;

import java.util.ArrayList;

import country.domain.CountryDTO;

public class EndView {
	
	public static void printAll(ArrayList<CountryDTO> all) { // ����Ʈ ��� ���
		for(int i = 0 ; i < all.size(); i++) {
			if(all.get(i) != null) {        // �߻� ������ ����� ��츦 ��� ������ �� �־�� �Ѵ�. 
			System.out.println(all.get(i).toString());
			}
		}
	}
	
	public static void printOne(CountryDTO one) {
		System.out.println(one.toString());
	}

	public static void printMsg() {
		System.out.println("�˻��� �����ʹ� �������� �ʽ��ϴ�.");
	}
	
	public static void printMsg(String msg) {
		System.out.println(msg);
	}
}
