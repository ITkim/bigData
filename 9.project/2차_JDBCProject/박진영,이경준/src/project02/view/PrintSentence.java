package project02.view;

import java.io.BufferedReader;
import java.io.IOException;

import project02.domain.ArcadeInfoDTO;
import project02.domain.ContractDTO;

public class PrintSentence {
	public static void printMain() {
		System.out.println("1. ��� ����ö �� �˻�");
		System.out.println("2. �ش� ȣ�� �� �˻�");
		System.out.println("3. �ش� �� �� �˻�");
		System.out.println("4. ���� ���� �� �˻�");
		System.out.println("5. ���ο� �� ��� �ۼ�");
		System.out.println("6. �ش� �� ��� ����");
		System.out.println("7. �� ���� ����");
		System.out.println("8. ����");
	}
	
	public static ArcadeInfoDTO printInsert(String data, BufferedReader in) throws IOException {
		ArcadeInfoDTO arcadeInfo = new ArcadeInfoDTO();
		ContractDTO contract = new ContractDTO();
		System.out.println("���� �ۼ��Ͻ� ���� �뵵�� �Է����ּ��� : ");
		System.out.println("Ex) ����, ���� ��");
		data = in.readLine();
		contract.setArcadeType(data);
		
		System.out.println("�ش� ���� ȣ���� �Է����ּ���.");
		System.out.println("Ex) 9ȣ�� => 9ȣ��, 2ȣ�� => 2ȣ��");
		data = in.readLine();
		arcadeInfo.setLine(data);
		
		System.out.println("�ش� �� ���� �Է����ּ���.");
		System.out.println("Ex) �뷮�� => �뷮����, ��ȭ�� => ��ȭ����");
		data = in.readLine();
		arcadeInfo.setStation(data);
		
		System.out.println("�󰡹�ȣ�� �Է����ּ���.");
		System.out.println("Ex) 1ȣ�� => 100-001 ~ 199-999, 2ȣ�� => 200-001 ~ 299-999, ... ");
		data = in.readLine();
		contract.setArcadeID(data);
		
		System.out.println("�� ������ �Է����ּ���.");
		System.out.println("Ex) 151.23, 27.32 ");
		data = in.readLine();
		arcadeInfo.setArea((Double.valueOf(data)));
		
		System.out.println("������ �Է����ּ���.");
		System.out.println("Ex) ������, �Ƿ� ");
		data = in.readLine();
		contract.setBusinessType(data);
		
		System.out.println("��� �������� �Է����ּ���.");
		System.out.println("Ex) 2018-07-16 ");
		data = in.readLine();
		contract.setContractStartDate(data);
		
		System.out.println("��� �������� �Է����ּ���.");
		System.out.println("Ex) 2020-07-16 ");
		data = in.readLine();
		contract.setContractEndDate(data);
		
		System.out.println("�Ӵ��/�����Ḧ �Է��� �ּ���..");
		System.out.println("Ex) 3000000, 500000");
		data = in.readLine();
		contract.setRental(Integer.parseInt(data));
		
		System.out.println("��� �Է��� �ּ���.");
		System.out.println("Ex) ����, ���ź�, ���������� ");
		data = in.readLine();
		contract.setNote(data);
		
		arcadeInfo.setContractInfo(contract);
		
		return arcadeInfo;
	}

	public static ContractDTO printUpdate(String data, BufferedReader in) throws IOException {
		ContractDTO contract= new ContractDTO();
		System.out.println("�ش� ���� ��ȣ�� �Է��� �ּ���.");
		System.out.println("Ex) 153-111, 231-235");
		data = in.readLine();
		contract.setArcadeID(data);
		
		System.out.println("���� �뵵�� �Է����ּ��� : ");
		System.out.println("Ex) ����, ���� ��");
		data = in.readLine();
		contract.setArcadeType(data);
		
		System.out.println("������ �Է����ּ���.");
		System.out.println("Ex) ������, �Ƿ� ");
		data = in.readLine();
		contract.setBusinessType(data);
		
		System.out.println("��� �������� �Է����ּ���.");
		System.out.println("Ex) 2018-07-16 ");
		data = in.readLine();
		contract.setContractStartDate(data);
		
		System.out.println("��� �������� �Է����ּ���.");
		System.out.println("Ex) 2020-07-16 ");
		data = in.readLine();
		contract.setContractEndDate(data);
		
		System.out.println("�Ӵ��/�����Ḧ �Է��� �ּ���..");
		System.out.println("Ex) 3000000, 500000");
		data = in.readLine();
		contract.setRental(Integer.parseInt(data));
		
		System.out.println("��� �Է��� �ּ���.");
		System.out.println("Ex) ����, ���ź�, ���������� ");
		data = in.readLine();
		contract.setNote(data);
		
		return contract;
	}
}
