package com.subjecs.service.impl;

import com.subjecs.entity.Student;
import com.subjecs.mapper.StudentMapper;
import com.subjecs.service.StudentService;
import com.subjecs.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentMapper studentDao;

    @Override
    public Map addStudent(Student student) {

        String password = MD5Utils.encrypt(student.getPassword() , MD5Utils.MD5_KEY);
        student.setPassword(password);
        System.out.println("success:" + student);
        Map resultMap = new HashMap();
        try{
            int result = studentDao.addStudents(student);
            if(result > 0){
                resultMap.put("code",200);
                resultMap.put("msg","success");
            }
        }catch (Exception e){
            e.printStackTrace();
            resultMap.put("code",500);
            resultMap.put("msg","系统开小差了，请联系管理员！");
        }
        return resultMap;
    }
}
