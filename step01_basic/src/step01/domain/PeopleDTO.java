/* Data Trasfer Object = Value Object = Java Bean
 * 1. ����Ģ
 * 		- ������DTO.java/������VO.java/������Bean.java/������.java
 * 2. ����
 * 		- ��� ���� : private
 * 		- ��� �޼ҵ� : ���� �� �����Ͱ� ��ȯ, �����Ͱ� ���� �������θ� ����
 * 							 ������ ���� �޼ҵ忡�� ���� ��ȿ�� ���� ����
 * 		- ������ : �⺻������, ��� ������ �ʱ�ȭ ������

 * 		- toString() : ��� �����鰪 �����ؼ� ��ȯ�ϴ� �޼ҵ� 
 */
package step01.domain;

public class PeopleDTO {
	private String name;
	private int age;
	
	public PeopleDTO() {}
	public PeopleDTO(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PeopleDTO [name=" + name + ", age=" + age + "]";
	}
	
}






