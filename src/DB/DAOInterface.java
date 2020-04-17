package DB;

import Server.ServerChat;

public interface DAOInterface {
	
	Boolean Insert(Object DTO, String notice, ServerChat ss);
	Boolean Select(Object DTO, String notice, ServerChat ss);
	Boolean Edit(Object DTO);
	Boolean Delete(Object DTO);
	//Boolean Insert();
	

}

