package com.wowoni.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wowoni.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
