package project.domain;

public class CriminalDTO {
	private String district;	//��ġ��
	private int caseSum;		//�߻��հ�
	private int arrestSum;	//�˰��հ�
	private int killCase;	//���ι߻�
	private int killArrest;	//���ΰ˰�
	private int robberCase;	//�����߻�
	private int robberArrest;		//�����˰�
	private int rapeCase;		//����,��������߻�
	private int rapeArrest;	//����,��������˰�
	private int theftCase;		//�����߻�
	private int theftArrest;	//�����˰�
	private int attackCase;		//���¹߻�
	private int attackArrest;		//���°˰�
	private int population;	//�α�
	
	public CriminalDTO() {}
	
	public CriminalDTO(String district, int caseSum, int arrestSum, int killCase, int killArrest, int robberCase,
			int robberArrest, int rapeCase, int rapeArrest, int theftCase, int theftArrest, int attackCase,
			int attackArrest, int population) {
		super();
		this.district = district;
		this.caseSum = caseSum;
		this.arrestSum = arrestSum;
		this.killCase = killCase;
		this.killArrest = killArrest;
		this.robberCase = robberCase;
		this.robberArrest = robberArrest;
		this.rapeCase = rapeCase;
		this.rapeArrest = rapeArrest;
		this.theftCase = theftCase;
		this.theftArrest = theftArrest;
		this.attackCase = attackCase;
		this.attackArrest = attackArrest;
		this.population = population;
	}

	
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getCaseSum() {
		return caseSum;
	}
	public void setCaseSum(int caseSum) {
		this.caseSum = caseSum;
	}
	public int getArrestSum() {
		return arrestSum;
	}
	public void setArrestSum(int arrestSum) {
		this.arrestSum = arrestSum;
	}
	public int getKillCase() {
		return killCase;
	}
	public void setKillCase(int killCase) {
		this.killCase = killCase;
	}
	public int getKillArrest() {
		return killArrest;
	}
	public void setKillArrest(int killArrest) {
		this.killArrest = killArrest;
	}
	public int getRobberCase() {
		return robberCase;
	}
	public void setRobberCase(int robberCase) {
		this.robberCase = robberCase;
	}
	public int getRobberArrest() {
		return robberArrest;
	}
	public void setRobberArrest(int robberArrest) {
		this.robberArrest = robberArrest;
	}
	public int getRapeCase() {
		return rapeCase;
	}
	public void setRapeCase(int rapeCase) {
		this.rapeCase = rapeCase;
	}
	public int getRapeArrest() {
		return rapeArrest;
	}
	public void setRapeArrest(int rapeArrest) {
		this.rapeArrest = rapeArrest;
	}
	public int getTheftCase() {
		return theftCase;
	}
	public void setTheftCase(int theftCase) {
		this.theftCase = theftCase;
	}
	public int getTheftArrest() {
		return theftArrest;
	}
	public void setTheftArrest(int theftArrest) {
		this.theftArrest = theftArrest;
	}
	public int getAttackCase() {
		return attackCase;
	}
	public void setAttackCase(int attackCase) {
		this.attackCase = attackCase;
	}
	public int getAttackArrest() {
		return attackArrest;
	}
	public void setAttackArrest(int attackArrest) {
		this.attackArrest = attackArrest;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("��ġ��: ");
		builder.append(district);
		builder.append("\t �߻��հ�: ");
		builder.append(caseSum);
		builder.append("\t �˰��հ�: ");
		builder.append(arrestSum);
		builder.append("\t ���ι߻�: ");
		builder.append(killCase);
		builder.append("\t ���԰˰�: ");
		builder.append(killArrest);
		builder.append("\t �����߻�: ");
		builder.append(robberCase);
		builder.append("\t �����˰�: ");
		builder.append(robberArrest);
		builder.append("\t �����˹߻�: ");
		builder.append(rapeCase);
		builder.append("\t �����˰˰�: ");
		builder.append(rapeArrest);
		builder.append("\t �����߻�: ");
		builder.append(theftCase);
		builder.append("\t �����˰�: ");
		builder.append(theftArrest);
		builder.append("\t ���¹߻�: ");
		builder.append(attackCase);
		builder.append("\t ���°˰�: ");
		builder.append(attackArrest);
		builder.append("\t �α���: ");
		builder.append(population);
		return builder.toString();
	}
	
}
