package step01.syntax;

public class Step10MyArt {
		public static String AttendPF(int value) {
			String retVal ="�̵��";
			
			if(value>=400) {
				retVal="����";
			}else if(value>=391){
				retVal="����";
			}else if(value>=360){
				retVal="�Ἦ 5ȸ ����";
			}else if(value>=320){
				retVal="�Ἦ 10ȸ ����";
			}else if(value>=280){
				retVal="�̼��� ����";
			}else {
				retVal="�̼���";
			}
			
			
			return retVal;
		}
		
		
		
		public static void main(String[] args) {
			System.out.println(AttendPF(255));
			System.out.println(AttendPF(400));
			System.out.println(AttendPF(350));
			System.out.println(AttendPF(285));
			System.out.println(AttendPF(392));
			System.out.println(AttendPF(252));
			

		}
}
