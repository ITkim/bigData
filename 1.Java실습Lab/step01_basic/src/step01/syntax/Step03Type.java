package step01.syntax;

import step01.domain.FriendVO;

public class Step03Type {

	public Step03Type(){}
	
	//FriendVO ��ȯ �޼ҵ�
	FriendVO getInstance() {
		return new FriendVO();//0x
	}
	//FriendVO �� �޼ҵ� parameter �� �ݿ��ϴ� �޼ҵ� 
	void m(FriendVO v) {//��������.m(FriendVO ��ü);   0x
		System.out.println(2 + " ---- " + v.name);//Ȳ�ι�
		v.name = "�տ���";
	}
	public static void main(String[] args) {
		Step03Type s = new Step03Type();
		FriendVO v2 = s.getInstance();//0x�� ����
		
		System.out.println(1+ " " + v2.name);//Ȳ�ι�
		s.m(v2);//0x
		System.out.println(3 + " " + v2.name);//�տ���
	}
}









