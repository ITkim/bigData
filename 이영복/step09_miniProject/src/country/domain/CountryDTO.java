package country.domain;

public class CountryDTO { // CountryDTO -> ����Ʈ 3�� �����ۿ� ����. 
	private String Item; // �Ǿ�, ��ǻ��, �װ�
	private Country country; // �� �� �� -> ������ Ŭ���� ���
	private Result result; // ������, ���������, ���α��, ��� ��Ī
	
	public CountryDTO() {
		super();
	}

	public CountryDTO(String item, Country country, Result result) {
		super();
		Item = item;
		this.country = country;
		this.result = result;
	}

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CountryDTO [Item=");
		builder.append(Item);
		builder.append(", country=");
		builder.append(country);
		builder.append(", result=");
		builder.append(result);
		builder.append("]");
		return builder.toString();
	}
}
