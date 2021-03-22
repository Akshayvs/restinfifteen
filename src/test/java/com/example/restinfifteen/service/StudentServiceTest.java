/*
package com.example.restinfifteen.service;

import com.example.restinfifteen.dal.SQLDatabase;
import com.example.restinfifteen.mode.Student;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class StudentServiceTest {

    @MockBean
    SQLDatabase database;

    @Autowired
    StudentService service;

    @Test
    public void contextLoad () {
        assertThat(service).isNotNull();
    }

    @Test
    public void contextLoadForDatabase () {
        assertThat(database).isNotNull();
    }


    @Test
    void addStudent() {
        String testEntry = "testStudent";

        when(database.add(any(Student.class))).thenReturn(true);

        Student result = service.addStudent( testEntry);

        assertThat(result.getName()).isEqualTo(testEntry);
    }

}

 */