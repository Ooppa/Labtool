package fi.javalabra.labtool.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "deadlines")
public class Deadline {

    @GeneratedValue
    @Id
    private long id;
    
    private String name;
    
    private int week;
    
    private double maxScore;
    
}
