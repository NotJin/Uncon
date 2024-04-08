package com.t2204m.Uncon.service;

import com.t2204m.Uncon.entity.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> getAllStudent();
    Optional<Student> getStudentById(int id);
    void save(Student student);
}
