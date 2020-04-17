package Server;

import java.net.Socket;
import java.util.ArrayList;

import DB.DAOCenter;

public class ServerCenter {
	private ArrayList<ServerChat> sList = new ArrayList<>();
	private DAOCenter dc = DAOCenter.getInstance();
	private String[] check = null;
	ServerChat chat = null;
	// private static ServerCenter sc;

	
	public ServerCenter() {

	}


	public void addServerChat(ServerChat s) {
		this.sList.add(s);
	}

	public void select(Object objectMember, ServerChat ss) {
		chat=ss;

		dc.whichone(objectMember,ss);
		System.out.println("DAO센터로");

	}

	public void goSC(String msg) {
		System.out.println("여기는 서버센터야 오바 : " + msg);
		
		chat.send(msg);
	}

}
