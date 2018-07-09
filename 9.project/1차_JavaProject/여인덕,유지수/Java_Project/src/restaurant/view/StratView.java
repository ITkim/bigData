package restaurant.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import restaurant.controller.RestaurantController;

public class StratView {

	public static void main(String[] args) {
		// Interface
		//System.out.println("<���Ͻô� �׸��� ������ �ּ���>");
		//System.out.println("1. ���� �߰� 2. ���� �˻� 3. ���� ����  4. ���� ���� ");

		RestaurantController controller = new RestaurantController();
		controller.fileIO();// ���� �о����(ó�� �ѹ�)

		// Ű���� �Է¹޾Ƽ� ����� �� ������
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = "";

			while (!input.equals("q")) {
				System.out.println();
				
				System.out.println("<���Ͻô� �׸��� ������ �ּ���>");
				System.out.println("1. ���� �߰�  2. ���� �˻�  3. ���� ����   4. ���� ���� ");
				input = in.readLine();
				if (input.equals("1")) {
					controller.create();
				} else if (input.equals("2")) {
					System.out.println("1. ���Ҹ����� �˻�  2. ���������� �˻�");
					String input2 = in.readLine();
					controller.read(input2);
				} else if (input.equals("3")) {
					controller.upgrade();
				} else if (input.equals("4")) {
					controller.delete();
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
