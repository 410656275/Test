package com.example.controller;

import com.example.dao.repository.StudentRepository;
import com.example.entity.table.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cc on 17-1-16.
 */
@RestController
@RequestMapping("student")
public class StudentController {



    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("save")
    public Student save(Student student){
        try {
            student =studentRepository.save(student);
        }catch (Exception e){

            student.setName(e.getMessage());
            return student;
        }
        return student;
    }

    @PostMapping("deleteById")
    public void delete(){
        studentRepository.delete(5);
    }

    @PostMapping("deleteByPojo")
    public void deleteByPojo(Student student){

        studentRepository.delete(student);
    }

    @PostMapping("update")
    public Student update(Student student){
        return studentRepository.save(student);
    }


    @PostMapping("find")
    public Student find(){
        return studentRepository.findOne(1);
    }

}
