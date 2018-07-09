package restaurant.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import restaurant.domain.RestaurantDTO;

public class RestaurantModel {

	public static HashMap<String, RestaurantDTO> restaurant = new HashMap<>();

	public static HashMap<String, ArrayList<RestaurantDTO>> restaurant2 = new HashMap<>();

	public static ArrayList<RestaurantDTO> array_restaurant1 = new ArrayList<RestaurantDTO>(); // �ѽ�
	public static ArrayList<RestaurantDTO> array_restaurant2 = new ArrayList<RestaurantDTO>(); // �߽�
	public static ArrayList<RestaurantDTO> array_restaurant3 = new ArrayList<RestaurantDTO>(); // �Ͻ�
	public static ArrayList<RestaurantDTO> array_restaurant4 = new ArrayList<RestaurantDTO>(); // ���

	public static void fileIO() {
		RestaurantDTO r = null;

		// #1. ���� �ҷ�����
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("dataset.txt"));
			String data = in.readLine();
			String[] data2 = null;

			// #2. ������ �ҷ�����
			while (data != null) {
				data2 = data.split(",");

				// #2.1. DTO�� ArrayList�� �ֱ�
				r = new RestaurantDTO(data2[0], data2[1], data2[2].replace(" ", ""), data2[3].replace(" ", ""),
						data2[4], data2[5]);
				if (data2[4].equals("�ѽ�")) {
					array_restaurant1.add(r);
				} else if (data2[4].equals("�߽�")) {
					array_restaurant2.add(r);
				} else if (data2[4].equals("�Ͻ�")) {
					array_restaurant3.add(r);
				} else if (data2[4].equals("���")) {
					array_restaurant4.add(r);
				}

				// #2.2 ���Ҹ��� �������� Hashmap�� �ֱ�
				restaurant.put(data2[0], r);
				// �̷��� ������ ���� ������ ������ �˻� �ӵ� ����� ���ؼ� �ڷ� ������ 2�� ����Ͽ���.
				data = in.readLine();
			}
			restaurant2.put("�ѽ�", array_restaurant1);
			restaurant2.put("�߽�", array_restaurant2);
			restaurant2.put("�Ͻ�", array_restaurant3);
			restaurant2.put("���", array_restaurant4);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// try {
			// in.close();// ����ߴ� �ý��� �ڿ��� ��ȯ�ϱ�(���� ���� ������ ���߿� �ý����� �ٿ� �� �� �ִ�)
			// } catch (IOException e) {
			// e.printStackTrace();
			// }
		}
	}

	// CRUD �����
	// #1. Create
	public boolean create() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean result = false;
		try {
			String input = in.readLine();
			String data[] = input.split(",");
			RestaurantDTO restaurantadd = new RestaurantDTO(data[0], data[1], data[2], data[3], data[4], data[5]);

			// 1�� [DTO�� HashMap�� ���� ��ü]
			restaurant.put(data[0], restaurantadd);

			// 2�� [DTO�� ArrayList�� ���� ��ü]

			if (data[4].equals("�ѽ�")) {
				if (array_restaurant1.add(restaurantadd)) {
					result = true;
				}
			} else if (data[4].equals("�߽�")) {
				if (array_restaurant2.add(restaurantadd)) {
					result = true;
				}
			} else if (data[4].equals("�Ͻ�")) {
				if (array_restaurant3.add(restaurantadd)) {
					result = true;
				}
			} else if (data[4].equals("���")) {
				if (array_restaurant4.add(restaurantadd)) {
					result = true;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	// 2. Ư�� ������ �ҷ����� (�Է� �� ��ȯ�Ͽ� ã���ֱ� )
	public static void read1() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String search = null;
		try {
			search = in.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (restaurant.get(search) != null) {
			System.out.println(restaurant.get(search).toString());
			//return restaurant.get(search);
		} else {
			System.out.println("�Է��Ͻ� ���Ҹ� ã�� ���߽��ϴ�.");
			//return null;
		}

	}

	// 2. Ư�� ���������� ���� ���Ҹ�
	public static ArrayList<RestaurantDTO> read2() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String search = null;
		try {
			search = in.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
		if (restaurant2.get(search) != null) {
			return restaurant2.get(search);
		} else {
			return null;
		}
	}

	public static boolean update() {
		boolean c = false;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input1 = null;
		String input2 = null;
		RestaurantDTO a = new RestaurantDTO();
		try {
			System.out.println("������ ���Ҹ��� �Է��� �ּ���");
			input1 = in.readLine();
			a = restaurant.get(input1);
			if (a != null) {
				System.out.println("������ ���� �Է��� �ּ���");
				input2 = in.readLine();
				a.setTelephone_number(input2);
				if (restaurant.put(input1, a) != null) {
					c = true;
				}
			} else {
				System.out.println("�߸��� ���Ҹ� �Դϴ�.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return c;
	}

	// 4. �ش� ������ Ż��
	public static boolean delete() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		boolean result = false;
		try {
			input = in.readLine();
			if (restaurant.remove(input) != null) {
				result = true;
			} else {
				System.out.println("�߸��� ���Ҹ� �Դϴ�.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
