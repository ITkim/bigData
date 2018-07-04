/*
 * 1. ���� ���ο� �� ��ü ���� �ϳ��� ���������� �����ϴ� ����
 * 2. singleton design pattern
 * 		1. ��ü ���� ������ �ϳ�
 * 		2. ���� ����
 * 			1. �����ڴ� �ܺ� Ŭ�������� ����
 * 				private ������ ( [...] ) { [...] }
 * 			2. ������ Ŭ���� ������ ������ ȣ��
 * 				- ��ü ����
 * 			3. ������ ��ü�� �ܺ� Ŭ�������� ����ϰ� �Ϸ���?
 * 				- ������ ��ü�� �ּҰ� ��ȯ
 * 				- �� ����� �޼ҵ�� public
 * 				- �� �޼ҵ� ȣ�� ������ �ܺ� Ŭ�������� ��ü �������� ȣ�� ���� �޼ҵ�� static �̿��� �� 
 */
package probono.service;

import java.util.ArrayList;

import probono.model.dto.Activist;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
//	private static ProbonoProjectService instance = null
//	private ProbonoProject[] projectList = new ProbonoProject[10]; 
	ArrayList<ProbonoProject> projectList = new ArrayList<ProbonoProject>();
	private int index;

	private ProbonoProjectService(){} 
	
	public static ProbonoProjectService getInstance(){
//		if(instance == null)
//			instance = new ProbonoProjectService(); �� ���� �ϸ� ���������� ��ȭ �ϴ� ���̰� if �� �Ⱦ��� ���� ���� ���� �ӵ��� ���鿡�� ������ ���Ѵ�.
		return instance;
	}
	
	//��� Project ��ȯ
//	public ProbonoProject[] getAllProjects() {
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectList;
	}

	//Project �˻�
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
//		System.out.println(projectList.get(0));
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
//				System.out.println(projectList.get(0));

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
	
	
	//??? ������ ���� �޼ҵ�� Ȯ���ϱ�
	//instanceof - ��ü Ÿ�� �� ������ Ȱ��
	//Project ���� - ������Ʈ ������ ��� ����� ���� 
	public void projectUpdate(String projectName, People people){
		for(int i = 0 ; i < projectList.size() ; i ++) {
			if(projectList.get(i) != null && projectList.get(i).getProbonoProjectName().equals(projectName))
				if(people instanceof Activist) {
					projectList.get(i).setActivist((Activist)people);
				} else if(people instanceof Recipient) {
					projectList.get(i).setReceive((Recipient)people);
				}
		}	
	}

	 //Project ���� - ������Ʈ������ �ش� ������Ʈ ����
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}
	
	//Project ����
	public int projectListSize(){
		return index;
	}
}
