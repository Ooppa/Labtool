package fi.javalabra.labtool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.javalabra.labtool.domain.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
