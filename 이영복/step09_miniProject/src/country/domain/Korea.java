package country.domain;

public class Korea extends Data{ // Data Ŭ���� ���
	String korea; // Korea Class ���� ����� ���� ����

	/* ------------------------------------------------------------------------------------------------
	 * Korea Class ������ 
	 * super( [ ... ] ); �̿��Ͽ� �θ� Ŭ������ �Ӽ��� ��� ��ӹ��� �� �ֵ��� �Ѵ�.
	   ------------------------------------------------------------------------------------------------*/

	public Korea(String korea) {
		this.korea = korea;
	}

	public Korea(String korea, int year_2006, int year_2010, int year_2014, int job_hunter, int get_percent, int job_offer,
			int job_match) {
		super(year_2006, year_2010, year_2014, job_hunter, get_percent, job_offer, job_match);
		this.korea = korea;
	}
	
	/* ------------------------------------------------------------------------------------------------
	 * Korea Class ������ 
	 * super( [ ... ] ); �̿��Ͽ� �θ� Ŭ������ �Ӽ��� ��� ��ӹ��� �� �ֵ��� �Ѵ�.
	   ------------------------------------------------------------------------------------------------*/
	 
	public String getName() {
		return korea;
	}

	public void setName(String korea) {
		this.korea = korea;
	}
	/* ------------------------------------------------------------------------------------------------
	 * toString Override
	   ------------------------------------------------------------------------------------------------*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\n");
		return builder.toString();
	}
}

