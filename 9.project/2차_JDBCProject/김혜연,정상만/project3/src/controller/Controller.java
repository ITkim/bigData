package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.RestaDAO;
import model.domain.RestaDTO;
import view.EndView;

public class Controller {

	private static Controller instance = new Controller();

	private Controller() {
	}

	public static Controller getInstance() {
		return instance;
	}

	public void getRestaAll() {
		try {
			ArrayList<RestaDTO> datas = RestaDAO.getAll();
			if (datas.size() != 0) {
				EndView.printAll1(datas);
			} else {
				EndView.succMsg("\n�Է°��� ���� �ش� �����Ͱ� �������� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("\n�� �������� ���� ����Դϴ�.");
		}
	}

//	public void getAddress(String address) {
//		try {
//			RestaDTO datas = RestaDAO.getAddress(address);
//			if (datas != null) {
//				EndView.printOne1(datas);
//			} else {
//				EndView.succMsg("�˻��� �����Ͱ� �����ϴ�.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			EndView.errorMsg("�˼��մϴ�. ����Ŀ� �� ��û �ٶ��ϴ�.");
//		}
//	}
//	
//	public void getCategory(String category) {
//		try {
//			RestaDTO datas = RestaDAO.getCategory(category);
//			if (datas != null) {
//				EndView.printOne1(datas);
//			} else {
//				EndView.succMsg("�˻��� �����Ͱ� �����ϴ�.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			EndView.errorMsg("�˼��մϴ�. ����Ŀ� �� ��û �ٶ��ϴ�.");
//		}
//	}
	
	
	
	public void getAddcat(String address, String category) {
		try {
			RestaDTO datas = RestaDAO.getAddcat(address , category);
			if (datas != null) {
				EndView.printOne1(datas);
			} else {
				EndView.succMsg("\n�Է°��� ���� �ش� �����Ͱ� �������� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("\n�� �������� ���� ����Դϴ�.");
		}
	}
	
	public void getCategory(String category) {
		try {
			RestaDTO datas = RestaDAO.getCategory(category);
			if (datas != null) {
				EndView.printOne1(datas);
			} else {
				EndView.succMsg("\n�Է°��� ���� �ش� �����Ͱ� �������� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("\n�� �������� ���� ����Դϴ�.");
		}
	}
	


	// insert
	/*
	 * �߻� ������ ����Ǽ� 1. ���� ���� 1. true - ���� �Ϸ�, ���� ���� 2. false - ���ܴ� �ƴ����� ������ ���߽��ϴ�. 2.
	 * ������ ���� -�̹� �����ϴ� deptno�� ������ �õ��� SQLException �߻� -�̹� �����ϴ� �޼���....
	 */
	public void insert(RestaDTO newAddress) {
		try {
			if (RestaDAO.insert(newAddress)) {
				EndView.succMsg("\n���ο� �ּ� ���� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("\n�ٽ� �Է����ֽʽÿ�.");
		}
	}

	public void update(String address, String newCategory) {
		try {
			if (RestaDAO.update(address, newCategory)) {
				EndView.succMsg("\n������ �ּ� ���� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("\n���� �Ұ����մϴ�.");
		}
	}

	public void delete(String address) {
		try {
			if (RestaDAO.delete(address)) {
				EndView.succMsg("\n�ּ� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("\n�ּ� ���� ����");
		}
	}
}
