<<<<<<< HEAD:1.실습Lab/step05_miniTest_s/src/probono/model/dto/Probono.java
//���� ��� ��ο� ���� ���� ���� Ŭ��
package probono.model.dto;

public class Probono {
	private String probonoId;//��� ��� id
	private String probonoName;//��� ��� �̸�
	private String probonoPurpose;//
=======
// ���� ��� ��ο� ���� ���� ���� Ŭ����



package probono.model.dto;

public class Probono {
	private String probonoId; // ��� ��� id
	private String probonoName; // ��� ��� �̸�
	private String probonoPurpose; // ��� ��� ����
>>>>>>> 931d84b159238a4281a876c54cdc0a9466de1373:이영복/step05_miniTest_s/src/probono/model/dto/Probono.java
	
	public Probono() {}
		
	public Probono(String probonoId, String probonoName, String probonoPurpose) {
		super();
		this.probonoId = probonoId;
		this.probonoName = probonoName;
		this.probonoPurpose = probonoPurpose;
	}
	
	public String getProbonoId() {
		return probonoId;
	}

	public void setProbonoId(String probonoId) {
		this.probonoId = probonoId;
	}

	public String getProbonoName() {
		return probonoName;
	}

	public void setProbonoName(String probonoName) {
		this.probonoName = probonoName;
	}

	public String getProbonoPurpose() {
		return probonoPurpose;
	}

	public void setProbonoPurpose(String probonoPurpose) {
		this.probonoPurpose = probonoPurpose;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[���κ��� ���̵� : ");
		builder.append(probonoId);
		builder.append(", ���κ��� �̸� : ");
		builder.append(probonoName);
		builder.append(", ���κ��� ���� : ");
		builder.append(probonoPurpose);
		builder.append("]");
		return builder.toString();
	}
}
