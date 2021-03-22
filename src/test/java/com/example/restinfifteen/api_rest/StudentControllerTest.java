/*
package com.example.restinfifteen.api_rest;

import com.example.restinfifteen.mode.Student;
import com.example.restinfifteen.service.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class StudentControllerTest {

    @Autowired
    StudentController controller;

    @MockBean
    StudentService service;


    @Test
    public void getStudent() {
        UUID id = UUID.randomUUID();
        Student testResponse = new Student("Test Student");
        Mockito.when(service.getStudent(id)).thenReturn(testResponse);

        Student result = controller.getStudent(id);

        assertThat(result).isEqualTo(testResponse + "x");
    }


}
*/