package project02.model;

import java.util.ArrayList;

import project02.domain.ArcadeInfoDTO;
import project02.domain.ContractDTO;
import project02.domain.LineArcadeDTO;
import project02.domain.StationArcadeDTO;
import project02.domain.SubwayArcadeDTO;

public class SubwayArcadeModel {
	//////////////////////////////////////////////R
	// ��� �˻�
	// select * from dept
	public static ArrayList<SubwayArcadeDTO> getAll() {
		
		return null;
	}
	// ȣ���� �˻�
	public static LineArcadeDTO getLineInfo(String lineID) {
		
		return null;
	}
	// ���� �˻�
	public static StationArcadeDTO getStationInfo(String stationID) {
		
		return null;
	}
	
	// ���� �˻�
	public static ArcadeInfoDTO getEmptySpace() {
		
		return null;
	}
	
	//C
	//���ο� ��� ����
	//insert into tablename values (?,?,?,~~~)
	public static boolean insert(ArcadeInfoDTO contractArcade) {
	
		return false;
	}
	
	//U
	//���Ⱓ ����( ���� )
	public static boolean update(String arcadeID, ContractDTO contractInfo) {
		
		
		return false;
	}
	//D
	public static boolean delete(String arcadeID) {
		
		return false;
	}
}
