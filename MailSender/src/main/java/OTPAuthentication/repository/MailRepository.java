package OTPAuthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import OTPAuthentication.entities.MailEntities;

public interface MailRepository extends JpaRepository<MailEntities, Integer> {

}
