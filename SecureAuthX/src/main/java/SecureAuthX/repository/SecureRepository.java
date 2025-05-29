package SecureAuthX.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SecureAuthX.entities.SecureEntities;

public interface SecureRepository extends JpaRepository<SecureEntities, Integer> {
	
	SecureEntities findByUsername(String username);
	
}
