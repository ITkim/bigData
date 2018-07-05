/* 1. ���� ���ο� �� ��ü ���� �ϳ��� ���������� �����ϴ� ����
 * 2. Singleton Design Pattern
 * 		1. ��ü ���� ������ �ϳ�
 * 		2. ���� ����
 * 			1. �����ڴ� �ܺ� Ŭ�������� ����
 * 				- private ������([..]){[..]}
 * 			2. ������ Ŭ���� ������ ������ ȣ��
 * 				- ��ü ����
 * 			3. ������ ��ü�� �ܺ� Ŭ�������� ����ϰ� �Ϸ���?
 * 				- ������ ��ü�� �ּҰ� ��ȯ
 * 				-  �� ����� �޼ҵ�� public
 * 				- �� �޼ҵ� ȣ�� ������ �ܺ� Ŭ�������� 
 * 				  ��ü �������� ȣ�� ���� �޼ҵ� static
 */
package probono.service;

import java.util.ArrayList;

import probono.model.dto.Activist;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	
	private ArrayList<ProbonoProject> projectList = new ArrayList<ProbonoProject>();

	private ProbonoProjectService(){}
	
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	//��� Project ��ȯ
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectList;
	}

	//Project �˻�
	/* �ش� ������Ʈ�� ���� ��� �߸��� ������ ��û�Դϴ� ���� ���� �߻�?
	 * projectList[i] �迭�� �����Ͱ� �ִٴ� �����Ͽ� �޼ҵ� ȣ��
	 * �� ��� �迭�� null�� �ִٸ�  */
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
		int count = projectList.size();
		for (int i = 0; i < count; i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				project = projectList.get(i);
				break;
			}
		}
		return project;
	}

	//Project �߰�
	public void projectInsert(ProbonoProject project) {
		projectList.add(project);
	}
	
	
	public void projectUpdate(String projectName, People people){
		
		ProbonoProject project = null;		
		
		int count = projectList.size();
		for (int i = 0; i < count; i++) {	
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				project = projectList.get(i);
				
				if(people instanceof Activist){		//�����
					project.setActivist( (Activist)people );//����� ���� ���� �޼ҵ�
				}else if(people instanceof Recipient){
					project.setReceive( (Recipient)people);//������ ���� ���� �޼ҵ� 
				}
				
				break;
			}
		}
	}
	
	 //Project ���� - ������Ʈ������ �ش� ������Ʈ ����
	public void projectDelete(String projectName) {
		int count = projectList.size();
		for (int i = 0; i < count; i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}
/*	ArrayList�� ������ ������ ��ȯ���ִ� size() ȣ�� ��
 * ������ ���� ���� ��� ������ ������ �����Ŀ� ���� ��� ����
 * �޼ҵ� ȣ��� ��ɸ� ���� �ȵǰ� ���� performance�� ���
 * public void projectDelete2(String projectName) {
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}*/
}







