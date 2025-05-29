package SecureAuthX.services;

import SecureAuthX.entities.SecureEntities;

public interface SecureAuthService {
	
	void addRegister(SecureEntities secure);
	
	SecureEntities addLogin(SecureEntities secure);

}
