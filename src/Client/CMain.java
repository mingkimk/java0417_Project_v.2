package Client;

import java.net.Socket;


public class CMain {

	public static void main(String[] args) throws Exception {
		Socket withServer = null;
		withServer = new Socket("10.0.0.96",12345);
		System.out.println("�����Ƕ� ��Ʈ�ѹ� ����");
		new ClientChat(withServer);
	}

}

