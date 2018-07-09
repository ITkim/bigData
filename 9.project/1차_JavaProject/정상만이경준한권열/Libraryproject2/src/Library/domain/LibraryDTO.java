package Library.domain;

public class LibraryDTO {

	// ���� ����
	private String libraryName;
	private String city;
	private String district;
	private String libraryType;
	private String holiday;
	private String openTime;
	private String closedTime;
	private String holidayOpenTime;
	private String holidayClosedTime;
	private String location;
	private String phoneNumber;
	// ��ü ����
	public LibraryDTO(String libraryName, String city, String district, String libraryType, String holiday,
			String openTime, String closedTime, String holidayOpenTime, String holidayClosedTime, String location,
			String phoneNumber) {
		super();
		this.libraryName = libraryName;
		this.city = city;
		this.district = district;
		this.libraryType = libraryType;
		this.holiday = holiday;
		this.openTime = openTime;
		this.closedTime = closedTime;
		this.holidayOpenTime = holidayOpenTime;
		this.holidayClosedTime = holidayClosedTime;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}
	// ���� ����
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n*�������� :");
		builder.append(libraryName);
		builder.append("\n*�õ��� :");
		builder.append(city);
		builder.append("\n*������ :");
		builder.append(district);
		builder.append("\n*������ ���� :");
		builder.append(libraryType);
		builder.append("\n*������ :");
		builder.append(holiday);
		builder.append("\n*���� ����۽ð� :");
		builder.append(openTime);
		builder.append("\n*���� �����ð� :");
		builder.append(closedTime);
		builder.append("\n*������ ����۽ð� :");
		builder.append(holidayOpenTime);
		builder.append("\n*������ �����ð� :");
		builder.append(holidayClosedTime);
		builder.append("\n*������ ���θ� �ּ� :");
		builder.append(location);
		builder.append("\n*��ȭ��ȣ :");
		builder.append(phoneNumber);
		return builder.toString();
	}

}