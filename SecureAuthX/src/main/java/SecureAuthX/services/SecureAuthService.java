package SecureAuthX.services;

import SecureAuthX.entities.SecureEntities;

public interface SecureAuthService {
	
	void addRegister(SecureEntities secure);
	
	boolean userExist(String username);
	
	SecureEntities addLogin(SecureEntities secure);

}
