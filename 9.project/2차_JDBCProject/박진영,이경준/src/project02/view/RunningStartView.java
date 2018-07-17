package project02.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import project02.controller.ProjectController;
import project02.domain.ContractDTO;

public class RunningStartView {

	public static void main(String[] args) {
		ProjectController controller = ProjectController.getInstance();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String data = null;
		
		System.out.println("����ö �� ��� ���α׷�");
		try {
			data = in.readLine();
			while (data !=null) {
				Thread.sleep(1000);
				PrintSentence.printMain();
				try {
					data = in.readLine();
					if(Integer.parseInt(data) == 1) {			// ��ü ����ö �� ���� �˻�
						controller.getAll();
					}
					else if(Integer.parseInt(data) ==2) {		// �ش� ȣ�� �� ���� �˻�
						System.out.println("�˻��Ͻ� ȣ���� �Է��ϼ���.");
						System.out.println("Ex) 1ȣ�� => 1ȣ��, 9ȣ�� => 9ȣ��");
						data = in.readLine();
						controller.getLineInfo(data);
					}
					else if(Integer.parseInt(data) ==3) {		// �ش� �� �� ���� �˻�
						System.out.println("�˻��Ͻ� ������ �Է��ϼ���.");
						System.out.println("Ex) ����=> ���￪, �Ｚ=> �Ｚ��");
						data = in.readLine();
						controller.getStationInfo(data);
					}
					else if(Integer.parseInt(data) ==4) {		// ���� ���� �� �˻�
						System.out.println("-------------------- ������ ������ �� �����Դϴ�. --------------------");
						controller.getEmptySpace();
					}
					else if(Integer.parseInt(data) ==5) {		// ���ο� �� ��༭ �ۼ�
						controller.insert(PrintSentence.printInsert(data, in));	// �ʹ� �� printsetence�� �����ϴ�
					}
					
					else if(Integer.parseInt(data) ==6) {		// �ش� �� ������� ����
						ContractDTO con = PrintSentence.printUpdate(data,in); 
						controller.update(con.getArcadeID(), con);
					}
					else if(Integer.parseInt(data) ==7) {		// �ش� �� ���� ���� 
						System.out.println("������ �����Ͻ� �󰡹�ȣ�� �Է����ּ���.");
						data = in.readLine();
						controller.delete(data);
					}
					
					else if(Integer.parseInt(data) ==8) {		//����
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}
				}catch(Exception e) {
					System.out.println("�Է°��� �ٸ��� �ʽ��ϴ�");
				}
			}
		}catch (Exception e) {
			System.out.println("�Է°��� �ٸ��� �ʽ��ϴ�");
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println("�Է°��� �ٸ��� �ʽ��ϴ�");
			}
		}
	}		
}
