/* ��ǰ����
 * 1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 * 2. �ݺ�, ���ǵ ���� ������ �� �� �ִ� �ϳ��� lab ����
 * 3. ���� : �� ¦���� �����ϴ� ����...
 */


package step01.syntax;

public class Step10MyArt {
		public static String getAge(int age) {
			String retSchool = "������";
			if(age >= 0 & age<=4) {
				retSchool = "�����";
			}else if(age>=5 & age<=7) {
				retSchool = "��ġ��";
		}	 else if(age>=8 & age<=13) {
			    retSchool = "�ʵ��б�";
		}   else if(age>=14 & age<=16) {
			retSchool = "���б�";
		}	 else if(age>=17 & age <=19) {
			retSchool = "����б�";
		}	 else if(age>=20 & age <=28) {
			retSchool = "���л�";
		}   else { retSchool = "�л��� �ƴմϴ�.";
		}   return retSchool;
	}   
	
		public static void present() {
			char star = '*';
			for(int i=1; i<=5; i ++) {
				if(i==2) {System.out.println(star+"\t"+star+"\t");
				}
				   else if(i==3){System.out.println(star+" "+star+" "+star+" "+star+"\t"+star);
			}	   else {System.out.println(star+"\t"+star+"\t"+star);
			
			}
				}
		}
					
	public static void main(String[] args) {
		System.out.println("���̿� �´� �б�");
		System.out.println(getAge(26));
		System.out.println(getAge(46));
		System.out.println("\n");
		present();
		System.out.println("�ȳ�");
	}

}
