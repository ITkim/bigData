package restaurant.controller;

import restaurant.service.RestaurantService;
import restaurant.view.RestaurantEndView;

public class RestaurantController {
	public static void deleteOne(String restaurantName) {
		if(RestaurantService.restaurantDelete(restaurantName)) {
			RestaurantEndView.printMsg('"'+restaurantName+'"'+" "+"�������� ���������� ���� �Ǿ����ϴ�.");
		}else {
			RestaurantEndView.printMsg("�������� �ʴ� �������Դϴ�.");
		}
	}
	
	public static void updatepNumber(String restaurantName, String pNumber) {
		if(RestaurantService.restaurantUpdate(restaurantName,pNumber)) {
			RestaurantEndView.printMsg('"'+restaurantName+'"'+"�� ������ ��ȭ��ȣ�� "
					+" "+'"'+pNumber+'"'+"����"+" "+"���󺯰� �Ǿ����ϴ�.");
		}else {
			RestaurantEndView.printMsg("�������� �ʴ� �������Դϴ�.");
		}
	}
}