package country.domain;

public class CountryDTO { // CountryDTO -> ����Ʈ 3�� �����ۿ� ����
	private String Item; // �Ǿ�, ��ǻ��, �װ�
	private Korea korea; // ��-> ������ Ŭ���� ���
	private Japan japan; // ��-> ������ Ŭ���� ���
	private China china; // ��-> ������ Ŭ���� ���
	
	public CountryDTO(String Item) {
		super();
		this.Item = Item;
	}
	public CountryDTO(String Item, Korea korea, Japan japan, China china) {
		super();
		this.Item = Item;
		this.korea = korea;
		this.japan = japan;
		this.china = china;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String Item) {
		this.Item = Item;
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
	public void setChina(China china) {
		this.china = china;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[���� �о� = ");
		builder.append(Item +"]\n");
		builder.append("�ѱ�=");
		builder.append(korea);
		builder.append("�Ϻ�=");
		builder.append(japan);
		builder.append("�߱�=");
		builder.append(china);
		return builder.toString();
	}
}