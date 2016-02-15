package fi.javalabra.labtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.javalabra.labtool.domain.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
