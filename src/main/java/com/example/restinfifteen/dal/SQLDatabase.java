package com.example.restinfifteen.dal;

import com.example.restinfifteen.mode.Student;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class SQLDatabase {
    public boolean add(Student student) {
        System.out.println(" added to the db " + student.getName());
        return true;
    }

    public Student getStudent(UUID id) {
        Student student = new Student(" Default Student");
        student.setId(id);
        return student;
    }
}
