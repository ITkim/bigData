/*��ǰ ����
 *  1. ���� ��� ���뿡 �� �ؼ� 3���� �޼ҵ带 ����
 *  2. �ݺ� , ���ǵ ���� ������ �� �� �ִ� �ϳ��� lab ���� 
 *  3. ���� : �� ¦���� ���� �ϴ� ���� 
 */
package step01.report;

public class Step10MyArt {
	
	public static void rhombus() { //   ������ �����
		int a=4;
		for(int i = 1 ; i <= 5; i++) {
			for(int j = 4 ; i<=j;  j--) {
				System.out.print(" ");
			}
			for(int z=10 ; z>a*2+1; z--) {
				System.out.print("*");
			}
			System.out.println();
			a--;

		}
		a=1;
		for(int i = 1 ; i <= 5; i++) {
			for(int j = 1; j<=i;  j++) {
				System.out.print(" ");
			}
			for(int z=10 ; z>a*2+1; z--) {
				System.out.print("*");
			}
			System.out.println();
			a++;

		}
		
	}
	
	
	public static int studytime(int time ,int time2) {
		
		int Salary = 3000;
		int Salary2 = 2000;
		if (time >=400) {
			Salary = 3000;
			if(time2>=200) {
				Salary2 = 2000;
				Salary = Salary+Salary2;
			}
			else if(time2>=170) {
				Salary2 = 1700;
				Salary = Salary+Salary2;
			}
			else if(time2>=150) {
				Salary2 = 1500;
				Salary = Salary+Salary2;
			}
			else if(time2>=130) {
				Salary2 = 1300;
				Salary = Salary+Salary2;
			}
			else if(time2>=100) {
				Salary2 = 1000;
				Salary = Salary+Salary2;
			}
			else {
				Salary2 = 500;
				Salary = Salary+Salary2;
			}
		}
		else if (time>=380) {
			Salary = 2800;
			if(time2>=200) {
				Salary2 = 2000;
				Salary = Salary+Salary2;
			}
			else if(time2>=170) {
				Salary2 = 1700;
				Salary = Salary+Salary2;
			}
			else if(time2>=150) {
				Salary2 = 1500;
				Salary = Salary+Salary2;
			}
			else if(time2>=130) {
				Salary2 = 1300;
				Salary = Salary+Salary2;
			}
			else if(time2>=100) {
				Salary2 = 1000;
				Salary = Salary+Salary2;
			}
			else {
				Salary2 = 500;
				Salary = Salary+Salary2;
			}
		}
		else if (time>=360) {
			Salary =  2600;
			if(time2>=200) {
				Salary2 = 2000;
				Salary = Salary+Salary2;
			}
			else if(time2>=170) {
				Salary2 = 1700;
				Salary = Salary+Salary2;
			}
			else if(time2>=150) {
				Salary2 = 1500;
				Salary = Salary+Salary2;
			}
			else if(time2>=130) {
				Salary2 = 1300;
				Salary = Salary+Salary2;
			}
			else if(time2>=100) {
				Salary2 = 1000;
				Salary = Salary+Salary2;
			}
			else {
				Salary2 = 500;
				Salary = Salary+Salary2;
			}
		}
		else if (time>=340) {
			Salary = 2400;
			if(time2>=200) {
				Salary2 = 2000;
				Salary = Salary+Salary2;
			}
			else if(time2>=170) {
				Salary2 = 1700;
				Salary = Salary+Salary2;
			}
			else if(time2>=150) {
				Salary2 = 1500;
				Salary = Salary+Salary2;
			}
			else if(time2>=130) {
				Salary2 = 1300;
				Salary = Salary+Salary2;
			}
			else if(time2>=100) {
				Salary2 = 1000;
				Salary = Salary+Salary2;
			}
			else {
				Salary2 = 500;
				Salary = Salary+Salary2;
			}
		}
		else if(time>=320) {
			Salary = 2200;
			if(time2>=200) {
				Salary2 = 2000;
				Salary = Salary+Salary2;
			}
			else if(time2>=170) {
				Salary2 = 1700;
				Salary = Salary+Salary2;
			}
			else if(time2>=150) {
				Salary2 = 1500;
				Salary = Salary+Salary2;
			}
			else if(time2>=130) {
				Salary2 = 1300;
				Salary = Salary+Salary2;
			}
			else if(time2>=100) {
				Salary2 = 1000;
				Salary = Salary+Salary2;
			}
			else {
				Salary2 = 500;
				Salary = Salary+Salary2;
			}
		}
		else {
			Salary = 2000;
			if(time2>=200) {
				Salary2 = 2000;
				Salary = Salary+Salary2;
			}
			else if(time2>=170) {
				Salary2 = 1700;
				Salary = Salary+Salary2;
			}
			else if(time2>=150) {
				Salary2 = 1500;
				Salary = Salary+Salary2;
			}
			else if(time2>=130) {
				Salary2 = 1300;
				Salary = Salary+Salary2;
			}
			else if(time2>=100) {
				Salary2 = 1000;
				Salary = Salary+Salary2;
			}
			else {
				Salary2 = 500;
				Salary = Salary+Salary2;
			}
		}
		return Salary ;
		
	}

	public static void main(String[] args) {
		System.out.println("������ ���ô�. ����");
		rhombus();
		System.out.println("���� �ð��� ������ �ð��� ���� ����");
		System.out.println(studytime(400,200));
		System.out.println(studytime(350,100));
		System.out.println(studytime(290,100));



	}

}