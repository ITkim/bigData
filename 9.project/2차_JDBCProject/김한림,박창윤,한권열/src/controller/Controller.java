package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.ApartDAO;
import model.ApartDAO;
import model.domain.ApartDTO;
import model.domain.ApartDTO;
import view.EndView;

public class Controller {
	// ��� �˻�
		/*
		 * �߻� ������ ����� �� 1. ���� ���� -�����Ͱ� �ִ� = EndView���� ArrayList ��ü ���� -�����Ͱ� ���� =
		 * EndView���� �˻��� ������ ����..�޼��� 2. ������ ���� -���� �߻� : �˼��մϴ�. ����Ŀ� �� ��û �ٶ��ϴ�. �޼���
		 */
		private static Controller instance = new Controller();

		private Controller() {}

		public static Controller getInstance() {
			return instance;
		}

		public void getAll() {
			try {
				ArrayList<ApartDTO> datas = ApartDAO.getAll();
				if(datas.size()!=0) {
					EndView.printAll(datas);
				}else {
					EndView.succMsg("�˻��� ������ �����ϴ�.");
				}
			} catch (Exception e) {
				e.printStackTrace();
				EndView.errorMsg("�˼��մϴ�. ����Ŀ� ���û �ٶ��ϴ�.");
				}
		}
		
		//�˻�
		public void getApt(String area_name) {
			try {
				ArrayList <ApartDTO> datas = ApartDAO.getApt(area_name);
				if(datas.size() != 0) {
					EndView.printAll(datas);
				} else {
					EndView.succMsg("�˻��� �ε��� ������ �����ϴ�");
				}
			} catch (Exception e) {
				e.printStackTrace();
				EndView.errorMsg("�˼��մϴ�. ��� �Ŀ� ���û �ٶ��ϴ�");
			}
		}

		// ���ο� ���� ����
		public void insert(ApartDTO newApt) {
			try {
				if (ApartDAO.insert(newApt)) {
					EndView.succMsg("���ο� �ε��� ���� ���� ����");
				};
			} catch (SQLException e) {
				e.printStackTrace();
				EndView.errorMsg("�̹� �����ϴ� �ε��� �����Դϴ�");
			}
		}
		
		// ����
		public void update(int price, String area_name) {
			try {
				if (ApartDAO.update(price, area_name)) {
					EndView.succMsg(area_name + "���� ���� ����");
				};
			} catch (SQLException e) {
				e.printStackTrace();
				EndView.errorMsg("���� ���� �����Ͽ����ϴ�");
			}
		}	
		
		//����
		public void delete(String area_name) {
			try {
				if (ApartDAO.delete(area_name)) {
					EndView.succMsg(area_name +" ���� ������ ���� ����");
				};
			} catch (SQLException e) {
				e.printStackTrace();
				EndView.errorMsg("������ ���� �����߽��ϴ�");
			}
		}
		//����
		public void getMyHome(String area, int area_size, int pay, int savings, String bank) {
				try {
					EndView.succMsg("�� �� �����ϱ���� "+ ApartDAO.getMyHome(area, area_size, pay, savings, ApartDAO.getMyInterest(bank)) + "���� ���ҽ��ϴ�" + 
												"\n ���� ���� �������� " +  bank + " �������� "+ ApartDAO.getMyInterest(bank) +" �����Դϴ�");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	}

