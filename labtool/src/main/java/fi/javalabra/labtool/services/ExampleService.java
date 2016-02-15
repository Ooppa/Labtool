package fi.javalabra.labtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fi.javalabra.labtool.repository.CourseRepository;

/**
 *
 * @author Ooppa
 */
@Service
public class ExampleService {

	@Autowired
	CourseRepository repository;

	public String helloWorld() {
		return "Hello World!";
	}
}
