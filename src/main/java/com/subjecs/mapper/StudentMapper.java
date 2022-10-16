package com.subjecs.mapper;


import com.subjecs.entity.Student;
import org.springframework.stereotype.Repository;


public interface StudentMapper {
    int addStudents(Student student);
}
