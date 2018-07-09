package project.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import project.domain.CriminalDTO;

public class CriminalModel {
	
	static ArrayList<CriminalDTO> list = new ArrayList<CriminalDTO>();
	static BufferedReader in = null;
	static BufferedWriter out = null;
	static {
		try {
			in = new BufferedReader (new FileReader("criminal.csv"));
			out = new BufferedWriter(new FileWriter("result.csv"));
			String data = in.readLine();
			data = in.readLine();	//ù�� �ѱ��
			String[] splitData = data.split(",");
			
			while(data != null) {
				
				splitData = data.split(",");
				data = in.readLine();
				
				list.add(new CriminalDTO(splitData[0], Integer.parseInt(splitData[1]), Integer.parseInt(splitData[2]), Integer.parseInt(splitData[3]), Integer.parseInt(splitData[4]), Integer.parseInt(splitData[5]), Integer.parseInt(splitData[6]), Integer.parseInt(splitData[7]), Integer.parseInt(splitData[8]), Integer.parseInt(splitData[9]), Integer.parseInt(splitData[10]), Integer.parseInt(splitData[11]), Integer.parseInt(splitData[12]), Integer.parseInt(splitData[13])));
				
					//out.write(data);
					//out.newLine();
				out.flush();	//������ �ս��� ���ؼ� �������� ������ ��� ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	//�ڿ���ȯ
			try {
				in.close();	//����ó���� �ʿ���
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	//static
	
	 	
	//��� ���
	public static ArrayList<CriminalDTO> getAll() {
		System.out.println("\t\t< 2016�� ����� ��ġ���� 5�� ���� �߻� �� �˰� ��Ȳ>");	
		return list;
	}
	
	
	//���˺� �˰��� ��� �޼ҵ�
	public static HashMap<String, Double> calArrestRate(){
		HashMap<String,Double> criminalRateMap = new HashMap<String, Double>();	//�����̸�, �˰���
		String[] criminalName = {"���� �˰���", "���� �˰���", "������ �˰���", "���� �˰���", "���� �˰���"};
		double[] criminalRate = new double[5];
		int index = list.size()-1;

		criminalRate[0] = (double)list.get(index).getKillArrest() / (double)list.get(index).getKillCase() * 100;	//���ΰ˰���
		criminalRate[1] = (double)list.get(index).getRobberArrest() / (double)list.get(index).getRobberCase() * 100;	//���� �˰���
		criminalRate[2] = (double)list.get(index).getRapeArrest() / (double)list.get(index).getRapeCase() * 100;	//�����˰˰���
		criminalRate[3] = (double)list.get(index).getTheftArrest() / (double)list.get(index).getTheftCase() * 100;	//�����˰���
		criminalRate[4] = (double)list.get(index).getAttackArrest() / (double)list.get(index).getAttackCase() * 100;	//���°˰���
		
		
		for(int i=0; i<criminalName.length; i++) {
			criminalRateMap.put(criminalName[i], criminalRate[i]);
		}
		
		System.out.println("\t\t<���˺� �˰���>");
		return criminalRateMap;
		
	}
	
	
	//�� �� �� ���� ����
	public static HashMap<Integer, String> districtRank(){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int index = list.size()-1;
		String[] districtName = new String[index];	//�հ� ����
		int[] criminalSum = new int[index];
		HashMap<Integer, String> sortedMap = new HashMap<Integer, String>();
		
		
		for(int i=0; i<index; i++) {
			districtName[i] = list.get(i).getDistrict();
			criminalSum[i] = list.get(i).getCaseSum();
			
			map.put(districtName[i], criminalSum[i]);
		}
		
		
		Iterator it = sortByValue(map).iterator();
        
        
        
        for(int i=1; i<=index; i++) {
        	String temp = (String) it.next();
        	sortedMap.put(i, temp);
        	// System.out.println(i+"��: "+temp);
        }
        
        return sortedMap;
	
	}
	
	
	//hashMap �����ϴ� �޼ҵ�
	public static ArrayList<String> sortByValue(HashMap<String, Integer> map){
		ArrayList<String> list = new ArrayList<String>();
        list.addAll(map.keySet());
         
        Collections.sort(list, new Comparator(){
             
            public int compare(Object o1,Object o2){
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                 
                return ((Comparable) v1).compareTo(v2);
            }
             
        });
        Collections.reverse(list); // �ּ��� ��������
        return list;
    }
	
	
	
	//�� �� �˰���
	public static HashMap<String, Double> distArrestRate(){
        HashMap<String,Double> criminalRateMap2 = new HashMap<String, Double>();   //�����̸�, �˰���
        String[] distName = {"���α� �˰���","�߱� �˰���", "��걸 �˰���","������ �˰���","������ �˰���", "���빮�� �˰���", 
                                   "�߶��� �˰���", "���ϱ� �˰���", "���ϱ� �˰���",  "������ �˰���", "����� �˰���","���� �˰���",
                                   "���빮�� �˰���", "������ �˰���","��õ�� �˰���"," ������ �˰���","���α� �˰���","��õ�� �˰���",
                                   "�������� �˰���","���۱� �˰���","���Ǳ� �˰���", "���ʱ� �˰���","������ �˰���","���ı� �˰���", "������ �˰���"};
        double[] criminalRate = new double[26];
       
        for(int i = 0; i<distName.length;i++) {
           criminalRate[i] = (double)list.get(i).getArrestSum() / (double)list.get(i).getCaseSum() *  100;
           criminalRateMap2.put(distName[i],criminalRate[i]);
        }
        
        
        System.out.println("\t\t<�� �� �� �˰���>");
        
        return criminalRateMap2;
  }
	
	
	//�˻��ϴ°�
		public static CriminalDTO getOne(String district) {
	       
			CriminalDTO project = null;
			for(int i = 0; i < list.size(); i++) {
				if (list.get(i).getDistrict().equals(district)) { 
					project = list.get(i);
					break;
				}
			}
			return project;
		}
		
	
		
		//�����ϱ�
		public static  boolean CriminalDTOdelete(String district) {
	         int count = list.size();
	         for(int i=0; i<count; i++) {
	            if (list.get(i).getDistrict().equals(district)) {
	               list.remove(i); 
	               return true;
	            }
	         }   
	         return false;
	      }   

}
