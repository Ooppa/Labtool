package fi.javalabra.labtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fi.javalabra.labtool.domain.Customer;
import fi.javalabra.labtool.repository.CustomerRepository;

/**
 *
 * @author Ooppa
 */
@Service
public class ExampleService {

	@Autowired
	CustomerRepository repository;

	public String helloWorld() {
		return "Hello World!";
	}

	@Transactional
	public void saveCustomer(Customer customer) {
		repository.save(customer);
	}

	@Transactional
	public Customer getCustomer() {
		return repository.findAll().get(0);
	}
}
