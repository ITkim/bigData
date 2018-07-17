package project02.domain;

public class ContractDTO {
	private String arcadeType; // �� ����
	private String arcadeID; //�󰡹�ȣ
	private String businessType; // ����
	private String contractStartDate; // ��� ���� ��
	private String contractEndDate; // ��� ���� ��
	private int rental; // �Ӵ��
	private String note; // ���
	
	public ContractDTO() {}

	public ContractDTO(String arcadeType, String arcadeID, String businessType, String contractStartDate,
			String contractEndDate, int rental, String note) {
		this.arcadeType = arcadeType;
		this.arcadeID = arcadeID;
		this.businessType = businessType;
		this.contractStartDate = contractStartDate;
		this.contractEndDate = contractEndDate;
		this.rental = rental;
		this.note = note;
	}

	public String getArcadeType() {
		return arcadeType;
	}

	public void setArcadeType(String arcadeType) {
		this.arcadeType = arcadeType;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getArcadeID() {
		return arcadeID;
	}

	public void setArcadeID(String arcadeID) {
		this.arcadeID = arcadeID;
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(String contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public int getRental() {
		return rental;
	}

	public void setRental(int rental) {
		this.rental = rental;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", �� ���� =");
		builder.append(arcadeType);
		builder.append(", �󰡹�ȣ =");
		builder.append(arcadeID);
		builder.append(", ���� =");
		builder.append(businessType);
		builder.append(", �Ӵ� ������ =");
		builder.append(contractStartDate);
		builder.append(", �Ӵ� ������ =");
		builder.append(contractEndDate);
		builder.append(", �Ӵ�� =");
		builder.append(rental);
		builder.append(", ��� =");
		builder.append(note);
		return builder.toString();
	}
}
