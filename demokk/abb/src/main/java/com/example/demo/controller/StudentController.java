package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import com.example.demo.dao.StudentDao;
import com.example.demo.service.StudentService;
/**
 * @BelongsProject: springdatajpaday1
 * @BelongsPackage: com.wentao.springdatajpaday1.controller
 * @Author: 13274
 * @CreateTime: 2019-06-03 14:55
 * @Description: ${Description}
 */
@RestController
//@Api(value = "swagger ui 注释 api 级别")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    Integer count;
    @GetMapping("/sell")
    // @ApiOperation(value = "查询所有学生",notes = "查询所有学生")
    public Map selAll(Integer pageNum){
        if (pageNum==null||pageNum==0){
            pageNum=1;
        }
        if (count!=null&&pageNum>=count){
            pageNum=count;
        }
        Page<Student> byPage = studentService.findByPage(pageNum, 2);
        count= byPage.getTotalPages();
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("data",byPage);
        map.put("pageNum",pageNum);
        return map;
    }



    @DeleteMapping("/del")
    public  int del(Integer id){
        try {
            studentService.del(id);
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }

    @PostMapping("/add")
    public Student add(@RequestBody Student student){

        return studentService.add(student);
    }

    @PutMapping("/upd")
    public Student modifyStudent(Student student){
        return studentService.upd(student);
    }

}

