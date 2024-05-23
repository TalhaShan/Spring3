package com.inside.spring3.service;

import com.inside.spring3.model.Student;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    static List<Student> studentList = new ArrayList<>();

    @Autowired
    ObservationRegistry observationRegistry;

    public static Student addStudent(Student student) {
        studentList.add(student);

        return Observation.createNotStarted("addStudent",observat)
        return student;
    }
}
