package ThisIsJava.Inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " +dmbCellPhone.model);
		System.out.println("���� : " +dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : "+dmbCellPhone.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼��� ȣ�� 
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.recieveVoice("�ȳ��ϼ��� ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("�� �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone�� �޼��� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();


		
		
	}//end of main
}//end of class
