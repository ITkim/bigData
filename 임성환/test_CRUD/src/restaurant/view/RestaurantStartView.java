package restaurant.view;

import java.util.ArrayList;

import restaurant.controller.RestaurantController;
import restaurant.domain.RestaurantDTO;
import restaurant.service.RestaurantService;

public class RestaurantStartView {

	public static void main(String[] args) {
		RestaurantDTO restaurant = new RestaurantDTO("�Ｚ", "��Ƽķ�۽�", "����Ư���� ������ ���ﵿ", "02-3429-5119");
		
		RestaurantService service = RestaurantService.getInstance();
		
		//System.out.println("***** ���ο� Restaurant ���� �� Ȯ�� *****");
		//ArrayList<RestaurantDTO> allrestaurant = service.getAllRestaurant();
		//RestaurantEndView.aListdataView(allrestaurant);
		//service.restaurantInsert(restaurant);
		//RestaurantEndView.aListdataView(allrestaurant);
		
		//System.out.println("***** ������� Ȯ�� *****");
		//RestaurantController.deleteOne("���ΰ�");
		//RestaurantEndView.aListdataView(allrestaurant);
		//RestaurantController.deleteOne("���ΰ�");
		
		//System.out.println("***** ��ȭ��ȣ ���� Ȯ�� *****");
		//RestaurantController.updatepNumber("��Ƽķ�۽�","010-8835-1334");
		//RestaurantEndView.aListdataView(allrestaurant);
		//RestaurantController.updatepNumber("501ȣ","010-8835-1334");
		 
		System.out.println(RestaurantService.sb_gangnam);
	}
}
