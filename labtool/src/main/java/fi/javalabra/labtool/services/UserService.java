package fi.javalabra.labtool.services;

import fi.javalabra.labtool.domain.User;
import fi.javalabra.labtool.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public UserService() {
    }
    
    @Transactional(readOnly = true)
    public List<User> allUsers() {
        return repository.findAll();
    }
    
    @Transactional
    public void addUser(User user) {
        repository.save(user);
    }
}
