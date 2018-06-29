/*��ǰ ����
 * 1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 * 2. �ݺ�, ���� � ���� ������ �� �� �ִ� �ϳ��� lab ����
 * 3. ����: �� ¦���� �����ϴ� ����...
 * 
 * */

package step01.syntax;

import java.util.Scanner;

public class Step10MyArt {
	
	public static void cal(char operator, int a, int b) {
		int result=0;
		if(operator == '+') {
			result = a+b;
		}else if(operator == '-') {
			result = a-b;
		}else if(operator == '*') {
			result = a*b;
		}else if(operator == '/') {
			if(b == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			} else {
				result = a/b;
			}
		}else {
			System.out.println("��Ģ���� ��ȣ(+,-,*,/)�� �Է����ּ���.");
		}
	
		System.out.println(a+" "+operator+" "+b+" = "+result);
	}
	
	
	public static void avg(int n) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum = 0;
		double result;
		
		System.out.print("���� �Է�("+n+"��): ");
		for(int i=0; i<n; i++) {
			num = sc.nextInt();
			sum = sum+num;
		}
		result = sum/n;
		System.out.println("�� ��հ��� "+result+"�Դϴ�.");
	}
	public static void main(String[] args) {
		System.out.println("-----��Ģ����-----");
		cal('-',5,2);
		System.out.println("-----��ձ��ϱ�-----");
		avg(5);
		
	}

}
