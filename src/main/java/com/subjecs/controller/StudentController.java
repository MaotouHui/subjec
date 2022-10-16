package com.subjecs.controller;


import com.subjecs.entity.Student;
import com.subjecs.service.StudentService;
import com.subjecs.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/addStudent" , method = RequestMethod.POST)
    @ResponseBody
    public Map addStudents(Student student){
        System.out.println(student);
        Map resultMap = new HashMap<>();
        resultMap.put("code" , 200);
        studentService.addStudent(student);
        return resultMap;
    }



}
