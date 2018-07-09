package country.controller;

import country.domain.CountryDTO;
import country.model.CountryModel;
import country.view.EndView;
	
public class CountryController {
	
	public static void all() {
		EndView.printAll(CountryModel.getAllCountry());
	}
	
	public static void getOne(String id) {
		CountryDTO one = CountryModel.getCountryByItem(id);
		if(one != null) {
			EndView.printOne(one); // �˻��� �����Ͱ� ������ ��� true
		}else {
			EndView.printMsg();
		}
	}
	
/*	public static void addOne(String itemName, Data data) {
		boolean result = CountryModel.insertItem(itemName, data);
		if(result) {
			EndView.printMsg("�ش� item�� ���� ���� �߰� �Ϸ�");
		}else {
			EndView.printMsg("�ش� �о��� Item�� �������� �ʽ��ϴ�.");
		}
			
	}*/
	
	public static void deleteOne(String item) {
		boolean result = CountryModel.DeleteItem(item);
		if(result) {
			EndView.printMsg(item + "���� �Ϸ�\n");
		}else {
			EndView.printMsg(item + "���� ����\n");
		}
	}
	
	public static void CountryUpdate(String ItemName, String country_name, int num1, int num2) {
		boolean result = CountryModel.CountryUpdate(ItemName, country_name, num1, num2);
		if(result) {
			EndView.printMsg("���� �Ϸ�");
		}else {
			EndView.printMsg("���� �Ұ�");
		}
	}
	
	public static void CountryMatching(String ItemName, String CountryName) {
		boolean result = CountryModel.Matching(ItemName, CountryName);
		if(result) {
			EndView.printMsg("�ش� �оߴ� ������ ��ġ�� �ֽ��ϴ�");
		}else {
			EndView.printMsg("�ش� �оߴ� ������ ��ġ�� �����ϴ�.");
		}
	}
}
