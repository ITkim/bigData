package project.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import project.domain.CriminalDTO;

public class EndView {
	public static void printAll(ArrayList<CriminalDTO> list) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) != null) {
				System.out.println(list.get(i).toString());
			}
		}
		System.out.println();
	}
	
	public static void printAll(HashMap<String, Double> map) {
	
		Set<String> keys = map.keySet();
		
		Iterator<String> allKey = keys.iterator();
		String k = null;
		
		while(allKey.hasNext()) {
			k = allKey.next();
			System.out.println("\t\t"+k+": "+Math.round(map.get(k)*100.0)/100.0+"%");
		}
		System.out.println();
	}
	
	
	public static void printAll2(HashMap<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		
		Iterator<Integer> allKey = keys.iterator();
		Integer k = null;
		
		while(allKey.hasNext()) {
			k = allKey.next();
			System.out.println("\t\t"+k+"��: "+map.get(k));
		}
		System.out.println();
	}
	
	public static void printOne(CriminalDTO district) {
		System.out.println(district);
		System.out.println();
	}
	
	public static void printMsg() {	//�ش� ���̵� ������
		System.out.println("��û�Ͻ� ������ �� �����մϴ�.");
		System.out.println();
	}
	
	public static void printMsg(String msg) {
		System.out.println(msg);
		System.out.println();
	}
}
