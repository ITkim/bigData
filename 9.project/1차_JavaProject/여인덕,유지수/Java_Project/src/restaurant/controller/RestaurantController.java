package restaurant.controller;

import restaurant.model.RestaurantModel;
import restaurant.view.EndView;

public class RestaurantController {
	RestaurantModel one= new RestaurantModel();
	
	public void create() {
		System.out.println("�߰��� ������ �Է��� �ּ���.");
		System.out.println("(���Ҹ�,������ ����,��������,��ȭ��ȣ,���� ī�װ�,���θ޴�)");
		if(one.create()) {
			EndView.printmsg("�� �Էµƽ��ϴ�.");
		}else {
			EndView.printmsg("���� �߰��� �����߽��ϴ�.");
		}
	}

	public void read(String input2) {
		if(input2.equals("1")) {
			System.out.println("�˻��Ͻ� ���Ҹ��� �Է����ּ���");
			RestaurantModel.read1();
		}else if(input2.equals("2")) {
			System.out.println("�˻��Ͻ� ���������� �Է����ּ���");
			EndView.printAll(one.read2());
		}
	}

	public void upgrade() {
		if(one.update()) {
			EndView.printmsg("�� �����Ǿ����ϴ�.");
		}else {
			EndView.printmsg("���� ����!!");
		}
	}

	public void delete() {
		System.out.println("������ ���Ҹ��� �Է����ּ���");
		if(one.delete()) {
			EndView.printmsg("�� ���������ϴ�.");
		}else {
			EndView.printmsg("�������� �ʽ��ϴ�");
		}
	}

	public void fileIO() {
		one.fileIO();
	}



}

/*public static void getOne(String id) {
	CustomerDTO one = CustomerModel.getOne(id);
	if(one!= null) {
		EndView.printOne(one);
	}else {
		EndView.printmsg("��û�Ͻ� ������ �������մϴ�.");*/