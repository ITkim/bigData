/*1.  ���� ���ο� �� ��ü ���� �ϳ��� ���������� �����ϴ� ���� 
 * 2. singleton design pattern 
 * 		1. ��ü ���� ������ �ϳ� 
 * 		2. ���� ���� 
 * 			1. �����ڴ� �ܺ� Ŭ�������� ����
 * 				private ������([...]){[...]}
 * 			2. ������ Ŭ���� ������ ������ ȣ��
 * 				- ��ü ���� 
 * 			3. ������ ��ü�� �ܺ� Ŭ�������� ����ϰ� �Ϸ���?
 * 				- ������ ��ü�� �ּҰ� ��ȯ
 * 				- �� ����� �޼ҵ�� public
 * 				- �� �޼ҵ� ȣ�� ������ �ܺ� Ŭ�������� 
 * 					��ü ���� ���� ȣ�� ���� �޼ҵ� static 
 * 
 * 
 */




package probono.service;

import probono.model.dto.Activist;

import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;


public class ProbonoProjectServiceArray {
	
	private static ProbonoProjectServiceArray instance = new ProbonoProjectServiceArray();
	
	private ProbonoProject[] projectList = new ProbonoProject[10];
	private int index;

	private ProbonoProjectServiceArray(){}
	
	public static ProbonoProjectServiceArray getInstance(){//if���� �Ⱦ� - performance�� ���� ����. ������ 
		return instance;
	}
	
	//��� Project ��ȯ
	public ProbonoProject[] getAllProjects() {//�޼ҵ带 ���� projectList��� ���� ��ȯ�Ѵ� 
		return projectList;
	}

	//Project �˻�
	public ProbonoProject getProbonoProject(String projectName) { //return���� ProbonoProject�̴� 
		ProbonoProject project = null;
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				project = projectList[i];
				break;
			}
		}
		return project;
	}

	//Project �߰�
	public void projectInsert(ProbonoProject project) {
		projectList[index++] = project;
	}
	
	
	//??? ������ ���� �޼ҵ�� Ȯ���ϱ�
	//instanceof - ��ü Ÿ�� �� ������ Ȱ��
	//Project ���� - ������Ʈ ������ ��� ����� ���� 
	public void projectUpdate(String projectName, People people){//people �θ��, recipient�� activist�� �ڽ��̶�..... 
	/*	for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
			if (people instanceof Activist ) {
					Activist p = (Activist) people;
					projectList[i].setActivist(p);
					}else if (people instanceof Recipient){
					Recipient p2 = (Recipient) people;
					projectList[i].setReceive(p2);
				}
				
			}
			*/
			
		ProbonoProject a =	getProbonoProject(projectName) ;
				if (people instanceof Activist ) {
					Activist p = (Activist) people;
					a.setActivist(p);
					}else if (people instanceof Recipient){
					Recipient p2 = (Recipient) people;
					a.setReceive(p2);
				}
				
			}
		
		
		/*����
		public boolean equals(Object o) {
			if(o instanceof PeopleDTO) {//��ü Ÿ�� �� ����ȯ�� �Ǵ��� ���� ���� 
				PeopleDTO p = (PeopleDTO) o;
				// data��� ���� �񱳸� ���� ����ȯ 
			
				//�� �޼ҵ带 ������ ��ü�� data ������
				//parameter�� ���Ե� ��ü�� data ������ ��
				
				if(name.equals(p.getName()) && age == p.age);
					return true; 
				}
			
			return false;
		}*/
		
		
	

	
	
	 //Project ���� - ������Ʈ������ �ش� ������Ʈ ����
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				projectList[i] = null;
				break;
			}
		}
	}
	

	
	
	//Project ����
	public int projectListSize(){
		return index;
	}
}
