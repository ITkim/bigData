package project02.controller;

import project02.domain.ArcadeInfoDTO;
import project02.domain.ContractDTO;
import project02.domain.LineArcadeDTO;
import project02.domain.StationArcadeDTO;
import project02.domain.SubwayArcadeDTO;
import project02.model.SubwayArcadeDAO;
import project02.view.RunningEndView;

public class ProjectController {
	
	private static ProjectController instance = new ProjectController();

	private ProjectController() {}
	
	public static ProjectController getInstance() {
		return instance;
	}
	
	public void getAll() {
		try {
			SubwayArcadeDTO subwayInfo = SubwayArcadeDAO.getAll();
			if(subwayInfo.getSubwayArcade() != null) {
				RunningEndView.printAll(subwayInfo); 
			}
			else {
				RunningEndView.succMsg("�����Ͱ� �����ϴ�.");
			}
		} catch(Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("�˼��մϴ�. ��� �Ŀ� ���û �ٶ��ϴ�.");
		}
	}

	public void getLineInfo(String lineID) {
		try {
			LineArcadeDTO lineInfo = SubwayArcadeDAO.getLineInfo(lineID);
			
			if(lineInfo.getLineArcade().size() != 0) {
				RunningEndView.printLine(lineInfo);
			}
			else {
				RunningEndView.succMsg("�ش� ȣ�� ��ȣ�� �����ϴ�.");
			}
		} catch(Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("�˼��մϴ�. ��� �Ŀ� ���û �ٶ��ϴ�.");
		}
	}

	public void getStationInfo(String stationID) {
		try {
			StationArcadeDTO stationInfo = SubwayArcadeDAO.getStationInfo(stationID);
			
			if(stationInfo.getStationArcade().size() != 0) {
				RunningEndView.printStation(stationInfo);
			}
			else {
				RunningEndView.succMsg("�ش� ������ �����ϴ�.");
			}
		} catch(Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("�˼��մϴ�. ��� �Ŀ� ���û �ٶ��ϴ�.");
		}
	}
	
	public void getEmptySpace() {
		try {
			StationArcadeDTO stationInfo = SubwayArcadeDAO.getEmptySpace();
			
			if(stationInfo.getStationArcade().size() != 0) {
				RunningEndView.printEmpty(stationInfo);
			}
			else {
				RunningEndView.succMsg("������ �����ϴ�.");
			}
		} catch(Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("�˼��մϴ�. ��� �Ŀ� ���û �ٶ��ϴ�.");
		}
	}
	
	public void insert(ArcadeInfoDTO arcadeInfo) {
		try {
			if(SubwayArcadeDAO.insert(arcadeInfo)) {
				RunningEndView.succMsg("�Է��Ͻ� ������ �߰��Ǿ����ϴ�.");
			}
			else {
				RunningEndView.succMsg("�̹� �ִ� ��ȣID�Դϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("�˼��մϴ�. ��� �Ŀ� ���û �ٶ��ϴ�.");
		}
	}
	
	public void update(String arcadeID, ContractDTO contractInfo) {
		try {
			if(SubwayArcadeDAO.update(arcadeID, contractInfo)) {
				RunningEndView.succMsg("�ش� ��� ������ �����Ǿ����ϴ�.");
			}
			else {
				RunningEndView.succMsg("�ش� ID�� �������� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("�˼��մϴ�. �ش� ID���� ������ �ִ� ID�� Ȥ�� �ý��� �����Դϴ�. ��� �Ŀ� �õ����ּ���.");
		}
	}

	public void delete(String arcadeID) {
		try {
			if(SubwayArcadeDAO.delete(arcadeID)) {
				RunningEndView.succMsg("�ش� ������ ���������� �����Ǿ����ϴ�.");
			}
			else {
				RunningEndView.succMsg("�ش� ID�� �������� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("�˼��մϴ�. ��� �Ŀ� �ٽ� �õ����ּ���.");
		}
	}
}
