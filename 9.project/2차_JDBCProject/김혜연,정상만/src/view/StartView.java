package view;

import java.util.Scanner;

import controller.Controller;
import model.domain.RestaDTO;

public class StartView {
	public static void main(String[] a) {
		Controller controller = Controller.getInstance();

	/* 		��� �˻�
		 controller.getRestaAll();
		 �ϳ� �˻�
		 controller.getAddress("������");
		 controller.getCategory("���");
		 insert
		 controller.insert(new RestaDTO("�谡�� ���ִ� ���", "�ѽ�", "�н� & ���", "����� ������ ���ﵿ
		 444-666", "11:00 ~ 12:00" , "��~�� ����" , "02-444-4444", "��������", "10% ����" ) );
		 delete
		 controller.delete("����� ������ ���ﵿ 444-666");
	* 
	*/

		Scanner scan = new Scanner(System.in);

		System.out.println("***���� ��ġ�� �Է��ϼ��� (ex : ���۱�) : ");
		String ad = scan.next();
		System.out.println("***���Ͻô� �޴��� �����ϼ��� [�ѽ�, ���, �߽�, �Ͻ�] : ");
		String cg1 = scan.next();
		System.out.println("***�Է��Ͻ� ��ġ �ֺ��� ����Ʈ���̳� ī��, ������ҵ��� ������ ���Ͻʴϱ�? (Y/N) : ");
		String cg2 = scan.next();
		
		if (cg2.equals("Y")) {
			System.out.println("\n\n----------(@ RESTAURANT INFORMATION @)----------");
			controller.getAddcat(ad, cg1);
			System.out.println("\n----------(@ CAFE INFORMATION @)----------");
			controller.getAddcat(ad, "ī��");
		} else if (cg2.equals("N")) {
			System.out.println("----------(@ RESTAURANT INFORMATION @)----------");
			controller.getAddcat(ad, cg1);
		} else {
			System.out.println("Y �Ǵ� N �� �Է� �����մϴ�. �ٽ� �����Ͻʽÿ�.");
		}

	}
}
