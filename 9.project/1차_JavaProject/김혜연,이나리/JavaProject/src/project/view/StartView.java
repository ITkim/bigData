package project.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import project.controller.CriminalController;

public class StartView {
	static void printMenu() {
		System.out.println("==========================MENU==========================");
		System.out.println("\t1. 2016�� ����� ��ġ���� 5�� ���� �߻� �� �˰� ��Ȳ");
		System.out.println("\t2. ��ġ�� ������ �˻�");
		System.out.println("\t3. ��ġ�� ������ ����");
		System.out.println("\t4. �� �� ���� ����");
		System.out.println("\t5. ���� �� �˰���");
		System.out.println("\t6. �� �� �� �˰���"); 
		System.out.println("\t7. ����");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.print("�޴��� �����ϼ���: ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menuNum =0; 
		while(true) {
			
			printMenu();
			menuNum = sc.nextInt();
			switch(menuNum) {
				case 1:	//������ ��� ���
					
					CriminalController.getAll();
					break;
					
				case 2:		//��ġ�� ������ �˻�
					Scanner scanner = new Scanner(System.in);
					System.out.print("�� �̸��� �Է��ϼ���: ");
					String district = scanner.nextLine();
					CriminalController.getOne(district);
					
					break;
					
				case 3:		//��ġ�� ������ ����
					
					Scanner scanner2 = new Scanner(System.in);
					System.out.print("�� �̸��� �Է��ϼ���: ");
					String district2 = scanner2.nextLine();
					CriminalController.criminalDelete(district2);
					
					
					
					break;
				
					
				case 4:		//���� ���˼���
					CriminalController.districtRank();
					break;
					
				case 5:	//���˺� �˰���
					CriminalController.calArrestRate();
					break;
					
				case 6:		//���� �˰���
					CriminalController.distArrestRate();
					
					break;
				case 7:	//����
					System.out.println("���α׷��� �����մϴ�.");
					break;
					
				default:
					System.out.println("1���� 7������ ���ڸ� �Է��ϼ���.");
					break;
			}	//switch
			if(menuNum == 7) {
				sc.close();
				break;
			}		
		}	//while
	}
}

