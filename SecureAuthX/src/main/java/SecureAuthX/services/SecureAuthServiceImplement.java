package SecureAuthX.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SecureAuthX.entities.SecureEntities;
import SecureAuthX.repository.SecureRepository;

@Service
public class SecureAuthServiceImplement implements SecureAuthService {
	
	@Autowired
	SecureRepository repo;

	public void addRegister(SecureEntities secure) {
		repo.save(secure);		
	}
	
	public boolean userExist(String username) {
		SecureEntities name = repo.findByUsername(username);
		
		if (name != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public SecureEntities addLogin(SecureEntities secure) {
		SecureEntities entity =  repo.findByUsername(secure.getUsername());
		
		if (entity != null && entity.getUsername().equals(entity.getUsername())) {
			return entity;
		}
		
		return null;
		
	}

}
