package project02.domain;

import java.util.ArrayList;

public class StationArcadeDTO { // ���� ������
	private ArrayList<ArcadeInfoDTO> stationArcade;
	private String stationID;		//���� ID ex) ���￪, ���ڿ�
	
	public StationArcadeDTO() {}

	public StationArcadeDTO(ArrayList<ArcadeInfoDTO> stationArcade, String stationID) {
		super();
		this.stationArcade = stationArcade;	// �� �� ����
		this.stationID = stationID;		//�� ID
	}

	public ArrayList<ArcadeInfoDTO> getStationArcade() {
		return stationArcade;
	}

	public void setStationArcade(ArrayList<ArcadeInfoDTO> stationArcade) {
		this.stationArcade = stationArcade;
	}

	public String getStationID() {
		return stationID;
	}

	public void setStationID(String stationID) {
		this.stationID = stationID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StationArcadeDTO [stationArcade=");
		builder.append(stationArcade);
		builder.append(", stationID=");
		builder.append(stationID);
		builder.append("]");
		return builder.toString();
	}
}
