package fi.javalabra.labtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.javalabra.labtool.domain.WeekFeedback;

public interface WeekFeedbackRepository extends JpaRepository<WeekFeedback, Long> {
    
}
