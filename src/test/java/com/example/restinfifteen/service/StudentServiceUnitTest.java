package com.example.restinfifteen.service;

import com.example.restinfifteen.dal.SQLDatabase;
import com.example.restinfifteen.mode.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest

public class StudentServiceUnitTest {

    @Autowired
    StudentService service;

    @MockBean
    SQLDatabase database;


    @Test
    public void testAddStudent() {
        when(database.add(any(Student.class))).thenReturn(true);
        String studentName = "testStudent";

        Student addedStudent = service.addStudent(studentName);

        assertThat(addedStudent.getName()).isEqualTo(studentName);
    }
    
    @Test
    public void testGetStudent() {
        UUID testId = UUID.randomUUID();
        Student mockStudentResult = new Student(" mock student");
        when(database.getStudent(testId)).thenReturn(mockStudentResult);

        Student searchResult = service.getStudent(testId);

        assertThat(searchResult).isEqualTo(mockStudentResult);
    }



}
