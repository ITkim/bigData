package country.domain;

public class CountryDTO { // CountryDTO -> ����Ʈ 3�� �����ۿ� ����. 
	private String Item; // �Ǿ�, ��ǻ��, �װ�
	private Korea korea; // ��-> ������ Ŭ���� ���
	private Japan japan; // ��-> ������ Ŭ���� ���
	private China china; // ��-> ������ Ŭ���� ���
	
	public CountryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CountryDTO(String item, Korea korea, Japan japan, China china) {
		super();
		Item = item;
		this.korea = korea;
		this.japan = japan;
		this.china = china;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public Korea getKorea() {
		return korea;
	}
	public void setKorea(Korea korea) {
		this.korea = korea;
	}
	public Japan getJapan() {
		return japan;
	}
	public void setJapan(Japan japan) {
		this.japan = japan;
	}
	public China getChina() {
		return china;
	}
	public void setChina(China country_3) {
		this.china = china;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CountryDTO [Item=");
		builder.append(Item);
		builder.append(", korea=");
		builder.append(korea);
		builder.append(", japan=");
		builder.append(japan);
		builder.append(", china=");
		builder.append(china);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
