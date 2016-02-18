package fi.javalabra.labtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.javalabra.labtool.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
