package project02.domain;

import java.util.HashMap;

public class LineArcadeDTO {	// ȣ���� ������
	private HashMap<String, StationArcadeDTO> lineArcade;
	private String lineID;	// ȣ���� �ҷ����� ���� ���� String�� �����Ǵ� ID����
	
	public LineArcadeDTO() {}

	public LineArcadeDTO(HashMap<String, StationArcadeDTO> lineArcade, String lineID) {
		super();
		this.lineArcade = lineArcade;
		this.lineID = lineID;
	}

	public HashMap<String, StationArcadeDTO> getLineArcade() {
		return lineArcade;
	}

	public void setLineArcade(HashMap<String, StationArcadeDTO> lineArcade) {
		this.lineArcade = lineArcade;
	}

	public String getLineID() {
		return lineID;
	}

	public void setLineID(String lineID) {
		this.lineID = lineID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(lineArcade);
		builder.append(", lineID=");
		builder.append(lineID);
		return builder.toString();
	}
}
