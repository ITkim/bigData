package view;

import java.util.Scanner;

import controller.Controller;
import model.domain.ApartDTO;

public class StartView {

	public static void main(String[] args) {
		Controller controller = Controller.getInstance();

		// area_name���� area_size, year, month, price �˻�
		Scanner scan = new Scanner(System.in);
		int result = 0;
		String result2 = null;
		int int_result1 = 0;
		int int_result2 = 0;
		int int_result3 = 0;
		String str_result1 = null;
		String str_result2 = null;
		
		while( result != 7) {
		System.out.println("***********�޴�***********");
		System.out.println("  1 - ��� ������ ����");
		System.out.println("  2 - �ش� ���� �ε��� �˻��ϱ� ");
		System.out.println("  3 - ���ο� ������ �߰��ϱ�");
		System.out.println("  4 - �ش� ���� �ֽ� ������ �����ϱ�");
		System.out.println("  5 - �ش� ���� �ֽ� ������ �����ϱ�");
		System.out.println("  6 - �� �� �����ϱ�");
		System.out.println("  7 - ���α׷��� ���� �ϱ�");
		System.out.print(" �޴��� �����ϼ��� :  ");
		
		result = scan.nextInt();
		switch (result) {
		case 1: 
			
		System.out.println("*** ��� ������ ��� ***");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		controller.getAll();

		break;

		case 2:
		while(result!=0) {
			System.out.println("*** ������ �˻� �Ͻðڽ��ϱ�? 1 (Yes) / 0 (No) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.println("***  ������ �������ּ��� ***");
		result2 = scan.next();
		controller.getApt(result2);
		}

		break;

		case 3:

		// ����
		// ���ο� �μ� ���� ���� 
		// insert into apart values(?,?,?,?,?) 
		// insert into apart values(����,ũ��,�⵵,��,����)
		while(result!=0) {
			System.out.println("*** �����͸� �߰� �Ͻðڽ��ϱ�? 1 (Yes) / 0 (No) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.println("*** ���� �̸���?");
		str_result1 = scan.next(); 
		System.out.println("*** ���� ������?");
		str_result2 = scan.next();
		System.out.println("*** ������?");
		int_result1 = Integer.parseInt(scan.next());
		System.out.println("*** ����? ");
		int_result2 = Integer.parseInt(scan.next());
		System.out.println("*** ������? ");
		int_result3 = Integer.parseInt(scan.next());
		controller.insert(new ApartDTO(str_result1, str_result2, int_result1, int_result2, int_result3));
		}

		break;
		
		// price ����
		case 4:
			
		while(result!=0) {
			System.out.println("*** �����͸� ���� �Ͻðڽ��ϱ�? 1 (Yes) / 0 (No) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.println("*** ���� �̸���?");
		str_result1 = scan.next();
		System.out.println("*** ������?");
		int_result1 = scan.nextInt();
		controller.update(int_result1, str_result1);
		}

		break;

		// area_name���� ������ ����
		case 5:
		while(result!=0) {
			System.out.println("*** �����͸� ���� �Ͻðڽ��ϱ�? 1 (Yes) / 0 (No) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.print("***  ���� �� ������ �Է��ϼ��� : ");
		result2 = scan.next();
		controller.delete(result2);
		}
		break;

		case 6:
			while(result!=0) {
				System.out.println("*** �� �� �����ϰ� �����ʴϱ�? 1 (Yes) / 0 (No) ");
				result = scan.nextInt();
				if(result ==0) {
					break;
				}
		System.out.println("��� ������ ��� �����ʴϱ�?");
		str_result1 = scan.next();
		System.out.println("�� �� ��� �����ʴϱ�?");
		int_result1 = Integer.parseInt(scan.next());
		System.out.println("�󸶳� ���ʴϱ�? (������ �Է��Ͻÿ�: õ�� ����)");
		int_result2 = Integer.parseInt(scan.next());
		System.out.println("������ �� �ۼ�Ʈ �����ϼ���?");
		int_result3 = Integer.parseInt(scan.next());
		System.out.println("���� ��� ����Ͻʴϱ�?");
		str_result2 = scan.next();
		controller.getMyHome(str_result1, int_result1, int_result2, int_result3, str_result2);
		}		
		break;
		case 7:
			System.out.println("*** ���α׷��� ���� �Ǿ����ϴ�. ***");
			break;
		}
		
	}
	}

}
