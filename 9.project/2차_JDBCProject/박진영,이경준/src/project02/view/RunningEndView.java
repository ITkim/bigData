package project02.view;

import java.util.ArrayList;
import java.util.Iterator;

import project02.domain.ArcadeInfoDTO;
import project02.domain.LineArcadeDTO;
import project02.domain.StationArcadeDTO;
import project02.domain.SubwayArcadeDTO;

public class RunningEndView {
	
	//��ü ���� ���
	public static void printAll(SubwayArcadeDTO subwayInfo) {
		int subwayIndex =subwayInfo.getSubwayArcade().size(); 
		String key =null;
		Iterator<String> allKey =null;
		
		for(int i=0; i<subwayIndex; i++) {
			
			allKey = subwayInfo.getSubwayArcade().get(i).getLineArcade().keySet().iterator();
			
			if(allKey.hasNext()) {
				key = allKey.next();
				//for�� �ȿ��� �������� stationInfo�� �ҷ����� �� ���� �ѹ��� ������ ȿ�����̶�� �Ǵ�
				ArrayList<ArcadeInfoDTO> stationInfo = subwayInfo.getSubwayArcade().get(i).getLineArcade().get(key).getStationArcade();
				
				for( ArcadeInfoDTO arcadeInfo : stationInfo) {
					System.out.println(arcadeInfo);
				}
			}
		}
	}
	//ȣ�� ������ ���
	public static void printLine(LineArcadeDTO lineInfo) {
		Iterator<String> allKey =lineInfo.getLineArcade().keySet().iterator();
		String key = null;
		
		if(allKey.hasNext()) {
			key = allKey.next();
			
			ArrayList<ArcadeInfoDTO> stationInfo = lineInfo.getLineArcade().get(key).getStationArcade();
			for( ArcadeInfoDTO arcadeInfo : stationInfo) {
				System.out.println(arcadeInfo);
			}
		}
	}
	
	//�� ������ ���
	public static void printStation(StationArcadeDTO stationInfo) {
		for(ArcadeInfoDTO arcadeInfo : stationInfo.getStationArcade()) {
			System.out.println(arcadeInfo);
		}
	}
	
	public static void printEmpty(StationArcadeDTO stationInfo) {
		for(ArcadeInfoDTO dto : stationInfo.getStationArcade()) {
			System.out.println(dto);
		}
	}
	
	public static void succMsg(String msg) {
		System.out.println("���� ���� : " + msg);
	}

	public static void errorMsg(String msg) {
		System.out.println("������ ���� : " + msg);
	}
}
