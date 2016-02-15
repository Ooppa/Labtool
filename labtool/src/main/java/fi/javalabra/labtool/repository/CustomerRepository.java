package fi.javalabra.labtool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.javalabra.labtool.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
