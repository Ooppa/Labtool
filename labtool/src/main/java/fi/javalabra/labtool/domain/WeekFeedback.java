package fi.javalabra.labtool.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "feedbacks")
public class WeekFeedback implements Serializable {
    
    @GeneratedValue
    @Id
    private long id;

    private String week;
    
    private int points;
    
    private String text; 
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Registration registration;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private User reviewer;
}
