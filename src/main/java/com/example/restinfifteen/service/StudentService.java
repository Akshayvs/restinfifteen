package com.example.restinfifteen.service;

import com.example.restinfifteen.dal.SQLDatabase;
import com.example.restinfifteen.mode.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentService {

    private SQLDatabase database;

    @Autowired
    public StudentService(SQLDatabase database) {
        this.database = database;
    }

    public Student addStudent(String name) {
        Student student = new Student(name);
        database.add(student);
        return student;
    }

    public Student getStudent (UUID id ) {
        return database.getStudent(id);
    }

}
