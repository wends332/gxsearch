package com.wen.search.controller;

import com.wen.search.domain.Student;
import com.wen.search.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wendongsong
 */
@RequestMapping("/demo")
@RestController
public class DemoController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello word";
    }

    @GetMapping("/addStudent")
    public void addStudent(){
        Student student = new Student();
        student.setName("小明");
        student.setSex(true);
        studentService.addStudent(student);
    }

    @GetMapping("/queryStudent")
    public Student queryStudent(){
        return studentService.selectByPrimaryKey(8);
    }
}
