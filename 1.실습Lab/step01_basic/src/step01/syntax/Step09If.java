/* �н�����
 * 1. ���ǽ�
 * 	2. ����
 * 		1. ���� ��Ȳ�� �ϳ��� ���
 * 				if(���ǽ�){}   		1��
 * 		2. ���� ��Ȳ�� �ټ��� ���
 * 				if(���ǽ�){				1��
 * 				}else if(���ǽ�2){	0~*��
 * 				}else if(���ǽ�3){
 * 				}else if(���ǽ�4){
 * 				}else{ ��� ���ǽĿ� �ش���� ���� ��� }	 1��
 * 		3. ���� ��Ȳ���� �ƴ� ��쵵 ����ؾ� �ϴ� ��� 
 * 				if(){}else{}
 */
package step01.syntax;

public class Step09If {
	public static char getGrade(int value) {//91
		char retVal = 'A';
		if(value >= 90) {
			retVal = 'A';
		}else if(value >= 80) {
			retVal = 'B';
		}else if(value >= 70) {
			retVal = 'C';
		}else {
			retVal = 'F';
		}
		return retVal;
	}
	
	public static char getGrade2(String value) {
		char retVal = 'A';
		int value2 = Integer.parseInt(value);
		if(value2 >= 90) {
			retVal = 'A';
		}else if(value2 >= 80) {
			retVal = 'B';
		}else if(value2 >= 70) {
			retVal = 'C';
		}else {
			retVal = 'F';
		}
		return retVal;
	}
	
	public static void main(String[] args) {
		System.out.println(getGrade(91));
		System.out.println(getGrade2("50"));
	}

}




