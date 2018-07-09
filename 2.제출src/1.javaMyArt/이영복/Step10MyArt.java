/*
 * ��ǰ ����
 * 1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 * 2. �ݺ�, ���ǵ ���� ������ �� �� �ִ� �ϳ��� lab����
 * 3. �� ¦���� �����ϴ� ����....
 */

package step01.syntax;

import java.util.Scanner;

public class Step10MyArt {
	
	public static void FindNumber(int choice, int a) {
		if(choice == 1) {
			System.out.println("Ȧ���� ã�� ���α׷��Դϴ�.");
			System.out.print("�ش��ϴ� �������� Ȧ�� : ");
			for(int i = 1; i <=a; i++) {
				if(i%2 == 1) {
					System.out.print(i + " ");
				}
			}
			System.out.println("");
		}
		if(choice == 2) {
			System.out.println("¦���� ã�� ���α׷��Դϴ�.");
			System.out.print("�ش��ϴ� �������� ¦�� : ");
			for(int i = 1; i <=a; i++) {
				if(i%2 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println("");
		}
		if(choice == 3) {
			int num, i, count;
			System.out.println("�Ҽ��� ã�� ���α׷��Դϴ�.");
			System.out.print("�ش��ϴ� �������� �Ҽ� : ");
			for(num=2; num<a; num++) {
				count = 0;
				for(i=2; i<num; i++) {
					if(num%i == 0)
						count++;
				}
				if(count == 0)
					System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
	
	
	public static void SelectCalculator(int choice, int a, int b) {
			int result;
			if(choice == 1) {
				result = a+b;
				System.out.println("�ش� ���α׷��� '+' �Դϴ�.");
				System.out.println("a + b : " + result);
			}
			else if(choice ==2) {
				result = a-b;
				System.out.println("�ش� ���α׷��� '-' �Դϴ�.");
				System.out.println("a - b : " + result);
			}
			else if(choice ==3) {
				result = a*b;
				System.out.println("�ش� ���α׷��� '*' �Դϴ�.");
				System.out.println("a * b : " + result);
			}
			else if(choice ==4) {
				result = a/b;
				System.out.println("�ش� ���α׷��� '/' �Դϴ�.");
				System.out.println("a / b  : " + result);
			}
			else if(choice == 5) {
				result = a%b;
				System.out.println("�ش� ���α׷��� '%' �Դϴ�.");
				System.out.println("a % b  : " + result);
			}
			else {
				System.out.println("* Error * ��Ȯ�� ���� �Է����ּ���.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("====================================================================");
		System.out.println("���ϴ� ���α׷��� �������ּ��� < 1: ���� 2: ���ϴ� �� ã�� >");
		int pro = scan.nextInt();
		if(pro == 1) {
			while(true) {
				System.out.println("====================================================================");
				System.out.println("���ϴ� ���α׷��� �������ּ��� < 1: ���� 2: ���� 3: ���� 4: ������ 5: ������ ���   * 0 �Է½� ���� >*");
				int select = scan.nextInt();
				if(select == 0) {
					System.out.println("�ش� ���α׷��� ����Ǿ����ϴ�.");
					System.out.println("====================================================================");
					break;
				}
				else {
					System.out.println("�ش� �׸� ����� �� ���� �Է����ּ��� :  ");
					int p = scan.nextInt();
					int q = scan.nextInt();
					SelectCalculator(select,p,q);
				}
			}
		}
		else if(pro == 2) {
			while(true) {
				System.out.println("====================================================================");
				System.out.println("���ϴ� ���α׷��� �������ּ��� < 1: Ȧ�� ��� 2: ¦�� ��� 3: �Ҽ� ���   * 0 �Է½� ���� * >");
				int select = scan.nextInt();
				if(select == 0) {
					System.out.println("�ش� ���α׷��� ����Ǿ����ϴ�.");
					System.out.println("====================================================================");
					break;
				}
				else {
					System.out.println("�ش� �׸� ����� ���� �Է����ּ��� :  ");
					int p = scan.nextInt();
					FindNumber(select, p);
				}
			}
		}
	}

}
