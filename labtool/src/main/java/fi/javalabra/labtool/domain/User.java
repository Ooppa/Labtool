package fi.javalabra.labtool.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {
    
    public User() {
        
    }

    public User(String name, String email, String studentNumber) {
        this.name = name;
        this.email = email;
        this.studentNumber = studentNumber;
    }
    
    @GeneratedValue
    @Id
    private long id;

    private String name;

    private String email;

    private String studentNumber;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="user")
    private List<Registration> registrations;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "reviewer")
    private List<WeekFeedback> reviewsDone;
}
