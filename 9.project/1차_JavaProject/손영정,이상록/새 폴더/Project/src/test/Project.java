package test;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
public class Project {

	   static ArrayList<DataDTO> datas2016 = new ArrayList<DataDTO>();
	   static ArrayList<DataDTO> datas2015 = new ArrayList<DataDTO>();
	   static ArrayList<DataDTO> datas2014 = new ArrayList<DataDTO>();
	   static ArrayList<DataDTO> datas2013 = new ArrayList<DataDTO>();
	   
	   public static int sub(int a,int b) {
	      return b-a;
	   }
	   
	   
	   public static int sum(int a,int b) {
	      return a+b;
	   }
	   
	   public static float ratio(float a,float b) {
		   return (float)b/(float)(a+b);
	   }
	   
	   public static void a(int a)
	   {Dimension dim = new Dimension(1000, 300);
	   JFrame frame = new JFrame("������ ����");
	   frame.setLocation(200, 400);
	   frame.setPreferredSize(dim);
	   DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();   
	   celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
	      String header[] = {"����","2013","2014","2015","2016"};
	      String contents[][] ={
	    		  {"���˸��",Integer.toString(datas2013.get(a).getTotal()),Integer.toString(datas2014.get(a).getTotal()),Integer.toString(datas2015.get(a).getTotal()),Integer.toString(datas2016.get(a).getTotal())},
	    		  {"����������","",Integer.toString(sub(datas2013.get(a).getTotal(),datas2014.get(a).getTotal())),Integer.toString(sub(datas2014.get(a).getTotal(),datas2015.get(a).getTotal())),Integer.toString(sub(datas2015.get(a).getTotal(),datas2016.get(a).getTotal()))},
	    		  {"����",Integer.toString(sum(datas2013.get(a).getNormalMen(),datas2013.get(a).getNormalWomen())),Integer.toString(sum(datas2014.get(a).getNormalMen(),datas2014.get(a).getNormalWomen())),Integer.toString(sum(datas2015.get(a).getNormalMen(),datas2015.get(a).getNormalWomen())),Integer.toString(sum(datas2016.get(a).getNormalMen(),datas2016.get(a).getNormalWomen()))},
	    		  {"������",Integer.toString(sum(datas2013.get(a).getAbnormalMen(),datas2013.get(a).getAbnormalWomen())),Integer.toString(sum(datas2014.get(a).getAbnormalMen(),datas2014.get(a).getAbnormalWomen())),Integer.toString(sum(datas2015.get(a).getAbnormalMen(),datas2015.get(a).getAbnormalWomen())),Integer.toString(sum(datas2016.get(a).getAbnormalMen(),datas2016.get(a).getAbnormalWomen()))},
	    		  {"�������� ����",Float.toString(ratio(sum(datas2013.get(a).getNormalMen(),datas2013.get(a).getNormalWomen()),sum(datas2013.get(a).getAbnormalMen(),datas2013.get(a).getAbnormalWomen()))),Float.toString(ratio(sum(datas2014.get(a).getNormalMen(),datas2014.get(a).getNormalWomen()),sum(datas2014.get(a).getAbnormalMen(),datas2014.get(a).getAbnormalWomen()))),Float.toString(ratio(sum(datas2015.get(a).getNormalMen(),datas2015.get(a).getNormalMen()),sum(datas2015.get(a).getAbnormalMen(),datas2015.get(a).getAbnormalWomen()))),Float.toString(ratio(sum(datas2016.get(a).getNormalMen(),datas2016.get(a).getNormalWomen()),sum(datas2016.get(a).getAbnormalMen(),datas2016.get(a).getAbnormalWomen())))} 		 
	      };
	      JTable table =new JTable(contents, header);
	      JScrollPane scrollpane = new JScrollPane(table);
	      TableColumnModel tcm = table.getColumnModel();
	      for(int i=0; i <tcm.getColumnCount();i++){
	    	  tcm.getColumn(i).setCellRenderer(celAlignCenter);
	      }
	      frame.add(scrollpane);
	      frame.pack();
	      frame.setVisible(true);
	      
		System.out.println("����   \t\t\t2013\t\t\t2014\t\t\t2015\t\t\t2016");
		System.out.println("���� ���\t\t\t" + datas2013.get(a).getTotal() + "\t\t" + datas2014.get(a).getTotal() + "\t\t"
				+ datas2015.get(a).getTotal() + "\t\t" + datas2016.get(a).getTotal());
		System.out.println("����������\t\t\t" + sub(datas2013.get(a).getTotal(), datas2014.get(a).getTotal()) + "\t\t"
				+ sub(datas2014.get(a).getTotal(), datas2015.get(a).getTotal()) + "\t\t"
				+ sub(datas2015.get(a).getTotal(), datas2016.get(a).getTotal()));
		System.out.println("\n����   \t\t\t2013\t\t\t2014\t\t\t2015\t\t\t2016");
		System.out.println("����\t\t\t" + sum(datas2013.get(a).getNormalMen(), datas2013.get(a).getNormalWomen())
				+ "\t\t\t" + sum(datas2014.get(a).getNormalMen(), datas2014.get(a).getNormalWomen()) + "\t\t\t"
				+ sum(datas2015.get(a).getNormalMen(), datas2015.get(a).getNormalWomen()) + "\t\t\t"
				+ sum(datas2016.get(a).getNormalMen(), datas2016.get(a).getNormalWomen()));
		System.out.println("������\t\t\t" + sum(datas2013.get(a).getAbnormalMen(), datas2013.get(a).getAbnormalWomen())
				+ "\t\t\t" + sum(datas2014.get(a).getAbnormalMen(), datas2014.get(a).getAbnormalWomen()) + "\t\t\t"
				+ sum(datas2015.get(a).getAbnormalMen(), datas2015.get(a).getAbnormalWomen()) + "\t\t\t"
				+ sum(datas2016.get(a).getAbnormalMen(), datas2016.get(a).getAbnormalWomen()));
		System.out
				.println(
						"�������� ����\t\t"
								+ ratio(sum(datas2013.get(a).getNormalMen(), datas2013.get(a).getNormalWomen()),
										sum(datas2013.get(a).getAbnormalMen(), datas2013.get(a).getAbnormalWomen()))
								+ "\t\t\t"
								+ ratio(sum(datas2014.get(a).getNormalMen(), datas2014.get(a).getNormalWomen()),
										sum(datas2014.get(a).getAbnormalMen(), datas2014.get(a).getAbnormalWomen()))
								+ "\t\t\t"
								+ ratio(sum(datas2015.get(a).getNormalMen(), datas2015.get(a).getNormalMen()),
										sum(datas2015.get(a).getAbnormalMen(), datas2015.get(a).getAbnormalWomen()))
								+ "\t\t\t"
								+ ratio(sum(datas2016.get(a).getNormalMen(), datas2016.get(a).getNormalWomen()),
										sum(datas2016.get(a).getAbnormalMen(), datas2016.get(a).getAbnormalWomen()))
								+ "\n");

	   }
	   

	

	public static void main(String[] args) throws IOException {
	      BufferedReader br1 =new BufferedReader(new FileReader("D:/ITstudy/javaproject/2016���� ����.csv"));
	      BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	      
	   
	   
	   String[] dataOne = null;
	   String line = null;
	   while (true) {
	      line = br1.readLine();
	      if (line == null) {
	         break;
	      }
	      dataOne = line.split(",");
	      datas2016.add(new DataDTO(dataOne[0], dataOne[1], Integer.parseInt(dataOne[2]), 
	                                 Integer.parseInt(dataOne[3]), Integer.parseInt(dataOne[4]), 
	                                 Integer.parseInt(dataOne[5]), Integer.parseInt(dataOne[6]), 
	                                 Integer.parseInt(dataOne[7]), Integer.parseInt(dataOne[8])));
	   }
	  
	   BufferedReader br3 =new BufferedReader(new FileReader("D:/ITstudy/javaproject/2015���� ����.csv"));
	      
	   
	   
	    String[] dataTwo = null;
	    String linetwo = null;
	   while (true) {
	      linetwo= br3.readLine();
	      if (linetwo == null) {
	         break;
	      }
	      dataTwo = linetwo.split(",");
	      datas2015.add(new DataDTO(dataTwo[0], dataTwo[1], Integer.parseInt(dataTwo[2]), 
	                                 Integer.parseInt(dataTwo[3]), Integer.parseInt(dataTwo[4]), 
	                                 Integer.parseInt(dataTwo[5]), Integer.parseInt(dataTwo[6]), 
	                                 Integer.parseInt(dataTwo[7]), Integer.parseInt(dataTwo[8])));
	   }

	   BufferedReader br4 =new BufferedReader(new FileReader("D:/ITstudy/javaproject/2014���� ����.csv"));
	      
	   
	   String[] dataOne2 = null;
	   String line2 = null;
	   while (true) {
	      line2 = br4.readLine();
	      if (line2 == null) {
	         break;
	      }
	      dataOne2 = line2.split(",");
	      datas2014.add(new DataDTO(dataOne2[0], dataOne2[1], Integer.parseInt(dataOne2[2]), 
	                                 Integer.parseInt(dataOne2[3]), Integer.parseInt(dataOne2[4]), 
	                                 Integer.parseInt(dataOne2[5]), Integer.parseInt(dataOne2[6]), 
	                                 Integer.parseInt(dataOne2[7]), Integer.parseInt(dataOne2[8])));
	   }
	   
	   BufferedReader br5 =new BufferedReader(new FileReader("D:/ITstudy/javaproject/2013���� ����.csv"));
	      
	   
	   String[] dataOne3 = null;
	   String line3 = null;
	   while (true) {
	      line3 = br5.readLine();
	      if (line3 == null) {
	         break;
	      }
	      dataOne3 = line3.split(",");
	      datas2013.add(new DataDTO(dataOne3[0], dataOne3[1], Integer.parseInt(dataOne3[2]), 
	                                 Integer.parseInt(dataOne3[3]), Integer.parseInt(dataOne3[4]), 
	                                 Integer.parseInt(dataOne3[5]), Integer.parseInt(dataOne3[6]), 
	                                 Integer.parseInt(dataOne3[7]), Integer.parseInt(dataOne3[8])));
	   }
	   
	   

		char a='\u0000';
		do {
		System.out.println("������ ã���� �ϴ� ������ ��з��� ���ÿ�");
		System.out.println("���¹���, ��������, ���¹���, ���ɹ���, ǳ�ӹ���, Ư����������, �������, ���ǹ���, ȯ�����, �������,\n �뵿����, �Ⱥ�����, ���Ź���, ��������, ��Ÿ���� ");
		String maincategory =br2.readLine();
		
		switch(maincategory) {
			case "���¹���" : System.out.println("������ ã���� �ϴ� ������ �ߺз��� ���ÿ�");
								   {	
									   for(int i = 0; i<=7; i++){
										System.out.print(datas2016.get(i).getDivisionCategory()+"  ");
										}
									   System.out.println();
									   
								   String divisioncategory1 =br2.readLine();
								  
								   switch(divisioncategory1) {
								   case "���α��" : 
			                           a(0);
			                           break;
			                        case "���ι̼�" :
			                           a(1);
			                        break;
			                        case "����" :
			                           a(2);
			                           break;
			                        case "����" : 
			                           a(3);
			                           break;
			                        case "���簭��" :
			                           a(4);
			                           break;
			                        case "��������" :
			                           a(5);
			                           break;
			                        case "��Ÿ����" : 
			                           a(6);
			                           break;
			                        case "��ȭ" :
			                           a(7);
			                           break;

								   default :	 System.out.println("ö�ڰ� Ʋ�Ƚ��ϴ�.");
								   	}
								   break;
										}
								   
								   
			case "��������" :	a(8);
									break;
			case "���¹���" :   System.out.println("������ ã���� �ϴ� ������ �ߺз��� ���ÿ�");
									   {	
										   for(int i = 9; i<=16; i++){
											System.out.print(datas2016.get(i).getDivisionCategory()+"  ");
											}
										   
									   String divisioncategory3 =br2.readLine();
									  
									   switch(divisioncategory3) {
									   case "����" :
				                           a(9);
				                           break;
				                        case "����" :
				                           a(10);
				                           break;
				                        case "ü�� ����" :
				                           a(11);
				                           break;
				                        case "����" :
				                           a(12);
				                                 break;
				                        case "���� ����" :
				                           a(13);
				                           break;
				                        case "��������" :
				                           a(14);
				                           break;
				                        case "����" :
				                           a(15);
				                           break;
				                        case "�ձ�" :
				                           a(16);
				                           break;

									   default :	 System.out.println("ö�ڰ� Ʋ�Ƚ��ϴ�.");
									   	}
									   break;
											}
			case "���ɹ���" :   System.out.println("������ ã���� �ϴ� ������ �ߺз��� ���ÿ�");
									   {	
										   for(int i = 17; i<=25; i++){
											System.out.print(datas2016.get(i).getDivisionCategory()+"  ");
											}
										   
									   String divisioncategory4 =br2.readLine();
									  
									   switch(divisioncategory4) {
									   case "��������" :
				                           a(17);
				                           break;
				                        case "���ǳ���" :
				                           a(18);
				                           break;
				                        case "������" :
				                           a(19);
				                           break;
				                        case "��ȭ" :
				                           a(20);
				                           break;
				                        case "���� ����" :
				                           a(21);
				                           break;
				                        case "������������" :
				                        	a(22);
				                        case "���" :
				                           a(23);
				                           break;
				                        case "Ⱦ��" :
				                           a(24);
				                           break;
				                        case "����" :
				                           a(25);
				                           break;
				                        default : System.out.println("ö�ڰ� Ʋ�Ƚ��ϴ�.");
				                        }
				                        break;
											}
			case "ǳ�ӹ���" :   System.out.println("������ ã���� �ϴ� ������ �ߺз��� ���ÿ�");
									   {	
										   for(int i = 26; i<=27; i++){
											System.out.print(datas2016.get(i).getDivisionCategory()+"  ");
											}
										   
									   String divisioncategory5 =br2.readLine();
									  
									   switch(divisioncategory5) {
									   case "��ǳ�ӹ���" :
				                           a(26);
				                           break;
				                        case "���ڹ���" :
				                           a(27);
				                           break;

									   default :	 System.out.println("ö�ڰ� Ʋ�Ƚ��ϴ�.");
									   	}
									   break;
											}
			case "Ư����������" :a(28);
									break;
			case "�������" :a(29);
									break;
			case "���ǹ���" :a(30);
									break;
			case "ȯ�����" :a(31);
									break;
			case "�������" :a(32);
									break;
			case "�뵿����" :a(33);
									break;
			case "�Ⱥ�����" :a(34);
									break;
			case "���Ź���" :a(35);
									break;
			case "��������" :a(36);
									break;
			case "��Ÿ����" :a(37);
									break;
			default : 	System.out.println("ö�ڰ� Ʋ���̽��ϴ�.");
			}
		System.out.println("�ٽ� �Ͻðڽ��ϱ�? (Y,y / y �̿�)");
		a=br2.readLine().charAt(0);
		
		}while(a=='Y'||a=='y');
		System.out.println("���α׷��� ����Ǿ����ϴ�. ����ϼ̽��ϴ�.");
		
		br1.close();
		br2.close();
		br3.close();
		br4.close();
		br5.close();
		}
}



