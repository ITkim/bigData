package step01;

public class Child extends Parent{
	String job;
	
	Child(){
		super("â��", 28) ;//Object -> Parent(name, age) -> Child(job)
		System.out.println("�ڽ��� �⺻ ������");
	}
	//������
	public void printAll() {
		super.printAll();
		System.out.println(job);
	}
	public static void main(String[] args) {
		//step02 - ������ 
		Parent p = new Child();
		p.name = "����";
		//p.job = "IT man"; //���� ����
		//�ڽĸ��� ����� access�� ���� �ʼ� ���� - ��ü���� ����ȯ
		Child c2 = (Child)p;
		c2.job = "IT man";
		p.printAll();
		
		System.out.println("-----------------");
		//step01 - ��� ������ ��ü ���� �н�
	/*	Child c = new Child();
		System.out.println(c.name);
		c.name = "��";
		System.out.println(c.name);
		c.printAll();*/
	}

}
