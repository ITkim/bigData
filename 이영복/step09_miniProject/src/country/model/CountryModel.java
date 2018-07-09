package country.model;

import java.util.ArrayList;

import country.domain.CountryDTO;

public class CountryModel {

	private static CountryModel instance = new CountryModel(); // �̱��� ��� ���
	static ArrayList<CountryDTO> CountryList = CsvInput.countryList; // CountryList ����

	private CountryModel() {}

	public static CountryModel getInstance() {  // instance ȣ���� method ����
		return instance;
	}

	public static ArrayList<CountryDTO> getAllCountry() {  // ��� Item�� Country�� ����ϱ� ���� CountryList ��ȯ 
		return CountryList;
	}

	public static CountryDTO getCountryByItem(String ItemName) { // Item�� �Է��� �� �ش� Item�� �ƽþ� 3�������� � ������ ��� �ִ��� �˻��ϱ� ���� Method 
		CountryDTO getOne = null;
		for (int i = 0; i < CountryList.size(); i++) {
			if (CountryList.get(i).getItem().equals(ItemName)) {
				getOne = CountryList.get(i);
				break;
			}
		}
		return getOne;
	}
	 /*public static boolean insertItem(String ItemName, Data data) {
	 for(int i = 0 ; i < CountryList.size() ; i ++) {
	 if(CountryList.get(i) != null &&
	 CountryList.get(i).getItem().equals(ItemName)) {
	 if(data instanceof Korea) {
	 CountryList.get(i).setKorea((Korea)data);
	 } else if(data instanceof Japan) {
	 CountryList.get(i).setJapan((Japan)data);
	 } else if(data instanceof China) {
	 CountryList.get(i).setChina((China)data);
	 }
	 return true;
	 }
	 }
	 return false;
	 }*/

	public static boolean DeleteItem(String ItemName) {      // �ش� Item�� ���� ��ġ�� ����� ��� Item ���� 
		for (int i = 0; i < CountryList.size(); i++) {
			if (CountryList.get(i).getItem().equals(ItemName)) {
				CountryList.remove(i);
				return true;
			}
		}
		return false;
	}

	public static boolean CountryUpdate(String ItemName, String CountryName, int num1, int num2) { // ������ ���� ��� ��Ī ���� ������ ���� �� ����
		// num1 : �ش� �о� ������ , num2 : ��� ��Ī
		for (int i = 0; i < CountryList.size(); i++) {
			if (CountryList.get(i) != null && CountryList.get(i).getItem().equals(ItemName)) {
				if (CountryList.get(i).getKorea().getName().equals(CountryName)) {
					CountryList.get(i).getKorea().setJob_hunter(num1);
					CountryList.get(i).getKorea().setJob_match(num2);
				} else if (CountryList.get(i).getJapan().getName().equals(CountryName)) {
					CountryList.get(i).getJapan().setJob_hunter(num1);
					CountryList.get(i).getJapan().setJob_match(num2);
				} else if (CountryList.get(i).getChina().getName().equals(CountryName)) {
					CountryList.get(i).getChina().setJob_hunter(num1);
					CountryList.get(i).getChina().setJob_match(num2);
				}
				return true;
			}
		}
		return false;
	}

	public static boolean Matching(String ItemName, String CountryName) { // ������ : ���� �������� 2.5  �Ǵ� ��������� 7% �� ���� ���� ��ġ ��ȯ
		for (int i = 0; i < CountryList.size(); i++) {
			if (CountryList.get(i) != null && CountryList.get(i).getItem().equals(ItemName)) {
				if (CountryList.get(i).getKorea().getName().equals(CountryName)) {
					if ((CountryList.get(i).getKorea().getYear_2014()
							/ CountryList.get(i).getKorea().getYear_2006()) > 2.5
							|| CountryList.get(i).getKorea().getGet_percent() >= 7) {
						return true;
					}
				} else if (CountryList.get(i).getJapan().getName().equals(CountryName)) {
					if ((CountryList.get(i).getJapan().getYear_2014()
							/ CountryList.get(i).getJapan().getYear_2006()) > 2.5
							|| CountryList.get(i).getJapan().getGet_percent() >= 7) {
						return true;
					}
				} else if (CountryList.get(i).getChina().getName().equals(CountryName)) {
					if ((CountryList.get(i).getChina().getYear_2014()
							/ CountryList.get(i).getChina().getYear_2006()) > 2.5
							|| CountryList.get(i).getChina().getGet_percent() >= 7) {
						return true;
					}
				}
			}
		}
		return false;
	}
}