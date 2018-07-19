package project02.domain;

public class ArcadeInfoDTO { // ���� ������x
	private ContractDTO contractInfo;
	private String line; // ȣ�� ����
	private String station; // ����
	private double area; // ����
	
	public ArcadeInfoDTO() {}

	public ArcadeInfoDTO(ContractDTO contractInfo, String line, String station, double area) {
		super();
		this.contractInfo = contractInfo;
		this.line = line;
		this.station = station;
		this.area = area;
	}

	public ContractDTO getContractInfo() {
		return contractInfo;
	}

	public void setContractInfo(ContractDTO contractInfo) {
		this.contractInfo = contractInfo;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(line);
		builder.append("]");
		builder.append(" ���� =");
		builder.append(station);
		builder.append(contractInfo);
		builder.append(", ���� =");
		builder.append(area);
		return builder.toString();
	}
}
