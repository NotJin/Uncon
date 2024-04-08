package com.t2204m.Uncon.dao;

import com.t2204m.Uncon.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
}
