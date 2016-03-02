package fi.javalabra.labtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.javalabra.labtool.domain.Submission;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
    
}
