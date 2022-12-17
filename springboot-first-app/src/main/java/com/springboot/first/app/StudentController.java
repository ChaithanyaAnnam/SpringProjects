package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Chaitanya","Annam");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Chaitanya","annam"));
        students.add(new Student("Van","anu"));
        students.add(new Student("Anil","patrick"));
        students.add(new Student("soundbar","anguish"));
        return students;
    }

    //http://localhost:8080/student/chaitanya/annam
    //@PathVariable annotaion
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String fName, @PathVariable("lastName") String lName){
        return new Student(fName,lName);
    }

    //Build Rest API to handle QueryParams
    //http://localhost:8080/student/query?firstName=chaitanya&lastName=annam
    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name="firstName") String firstName,
            @RequestParam(name ="lastName") String lastName){
        return new Student(firstName,lastName);
    }

}
