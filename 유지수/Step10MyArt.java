//��ǰ����
//1.���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
//2.�ݺ�, ���ǵ ���� ������ �� �� �ִ� �ϳ��� lab����
//3.���� : �� ¦���� �����ϴ� ����...

package step01.syntax;

public class Step10MyArt {

	// ������ ����ϱ� 2*1=2 ����
	public static void m1() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}

	}

	// if��: value�� ���� 10�̻� 100�̸��̸� ���� ���/ �ƴϸ� ���� ���
	public static void m2(int value) {

		if (value >= 10 && value < 100) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}

	}

	// while�� if�� ȥ�ջ��
	// ���� value�� ���� �ϳ��� ������Ű�鼭 10�̻��� �Ǹ� ������ ���(value�� �ʱⰪ�� 1)
	public static String m3() {

		int value = 1;
		while (true) {
			System.out.print(value);
			if (value == 10) {
				return "����";
			} else {
				value++;
			}

		}
	}

	public static void main(String[] args) {

		System.out.println("<1��>");
		m1();
		System.out.println("<2��>");
		m2(20);
		System.out.println("<3��>");
		System.out.println(m3());
	}

}
