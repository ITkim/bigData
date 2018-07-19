package country.view;

import java.util.ArrayList;
import java.util.Scanner;

import country.controller.CountryController;
import country.domain.CountryDTO;
import country.model.CountryModel;

public class StartView {

	public static void main(String[] args) {
		CountryModel service = CountryModel.getInstance();
		ArrayList<CountryDTO> allCountry = service.getAllCountry();
		// ��ü ������ �ҷ�����
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"======================================================================================================================");

		int select = 1;
		boolean result = false;
		boolean result2 = false;
		String ItemName = "";
		String CountryName = "";

		while (select != 0) {
			System.out.println(
					"[ ���ϴ� ����� �������ּ��� < 1: PrintAll  2: PrintOne 3: Delete Item 4:  Update 5: calculate 0: ���� > ]");
			select = scan.nextInt();
			if (select == 0) {
				System.out.println("[ �ش� ���α׷��� ����Ǿ����ϴ�. ]");
				System.out.println(
						"======================================================================================================================");
				break;
			}

			if (select == 1) {
				EndView.printAll(allCountry); // ��ü �˻�
			} else if (select == 2) {
				System.out.print("�о� �̸��� �Է��ϼ��� : < ");
				for(int i = 0 ; i < allCountry.size() ; i ++) {
					System.out.print(allCountry.get(i).getItem()+" ");
				}
				System.out.println(">");
				ItemName = scan.next();
				for (int i = 0 ; i < allCountry.size() ; i ++) {
					if (allCountry.get(i).getItem().equals(ItemName))
						result = true;
				}
				if (result == true) {
					CountryController.getOne(ItemName);
				} else {
					System.out.println("�о� �̸��� �߸��Ǿ����ϴ�.");
				}

			} else if (select == 3) {
				result = false;
				System.out.print("������ �о� �� �����Ͻ� �о߸� �Է��ϼ��� : < ");
				for(int i = 0 ; i < allCountry.size() ; i ++) {
					System.out.print(allCountry.get(i).getItem()+" ");
				}
				System.out.println(">");
				ItemName = scan.next();
				for (int i = 0; i < allCountry.size(); i++) {
					if (allCountry.get(i).getItem().equals(ItemName))
						result = true;
				}
				if (result == true) {
					CountryController.deleteOne(ItemName);
				} else {
					System.out.println("�о� �̸��� �߸��Ǿ����ϴ�.");
				}

			} else if (select == 4) {
				result = false;
				result2 = false;
				System.out.print("�о� �̸��� �Է��ϼ��� : < ");
				for(int i = 0 ; i < allCountry.size() ; i ++) {
					System.out.print(allCountry.get(i).getItem()+" ");
				}
				System.out.println(">");
				ItemName = scan.next();
				for (int i = 0; i < allCountry.size(); i++) {
					if (allCountry.get(i).getItem().equals(ItemName))
						result = true;
				}
				if (result == true) {
					System.out.println("���� �̸��� �Է��ϼ��� : <�ѱ�, �Ϻ�, �߱�>");
					CountryName = scan.next();
					for (int i = 0 ; i < allCountry.size() ; i++) {
						if (allCountry.get(i).getKorea().getName().equals(CountryName)) {
							result2 = true;
						}
						if (allCountry.get(i).getJapan().getName().equals(CountryName)) {
							result2 = true;
						}
						if (allCountry.get(i).getChina().getName().equals(CountryName)) {
							result2 = true;
						}
					}
					if (result2 == true) {
						System.out.println("�����Ͻ� ������ ���� �Է��ϼ��� : ");
						int num1 = scan.nextInt();
						System.out.println("�����Ͻ� ��� ��Ī ���� �Է��ϼ��� : ");
						int num2 = scan.nextInt();
						CountryController.CountryUpdate(ItemName, CountryName, num1, num2);
					} else {
						System.out.println("���� �̸��� �߸��Ǿ����ϴ�.");
					}

				} else {
					System.out.println("�о� �̸��� �߸��Ǿ����ϴ�");
				}

			} else if (select == 5) {
				System.out.print("�о� �̸��� �Է��ϼ��� : < ");
				for(int i = 0 ; i < allCountry.size() ; i ++) {
					System.out.print(allCountry.get(i).getItem()+" ");
				}
				System.out.println(">");
				ItemName = scan.next();
				result = false;
				result2 = false;
				for (int i = 0 ; i < allCountry.size() ; i ++) {
					if (allCountry.get(i).getItem().equals(ItemName))
						result = true;
				}
				if (result = true) {
					System.out.print("���� �̸��� �Է��ϼ��� : <�ѱ�, �Ϻ�, �߱�>");
					CountryName = scan.next();
					for (int i = 0 ; i < allCountry.size() ; i ++) {
						if (allCountry.get(i).getKorea().getName().equals(CountryName)) {
							result2 = true;
						}
						if (allCountry.get(i).getJapan().getName().equals(CountryName)) {
							result2 = true;
						}
						if (allCountry.get(i).getChina().getName().equals(CountryName)) {
							result2 = true;
						}
					}
					if (result2 == true) {
						CountryController.CountryMatching(ItemName, CountryName);
					} else {
						System.out.println("���� �̸��� �߸��Ǿ����ϴ�.");
					}
				} else {
					System.out.println("�о� �̸��� �߸��Ǿ����ϴ�");
				}
			}
		}
	}
}
