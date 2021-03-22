package com.example.restinfifteen.api_rest;


import com.example.restinfifteen.mode.Student;
import com.example.restinfifteen.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public Student getStudent (@RequestParam("id") UUID id) {

        return service.getStudent(id);
    }

    @PostMapping (value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student createStudent( @RequestBody Student s) {

        return service.addStudent(s.getName());

    }






}
