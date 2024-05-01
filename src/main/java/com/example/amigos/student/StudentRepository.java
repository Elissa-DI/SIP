package com.example.amigos.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This should be annotated as repository as this interface is responsible for data access
@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {
}
