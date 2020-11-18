package com.example.demo.impl;

import com.example.demo.entity.Student;
import com.example.demo.dao.StudentDao;
import com.example.demo.service.StudentService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
/**
 * @BelongsProject: springdatajpaday1
 * @BelongsPackage: com.wentao.springdatajpaday1.service.impl
 * @Author: 13274
 * @CreateTime: 2019-06-03 14:41
 * @Description: ${Description}
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;
    /**
     * 增加学生对象
     * @param student 要增加学生的对象
     * @return 返回学生对象
     */
    @Override
    public Student add(Student student) {
        Student s=studentDao.save(student);
        return s;
    }

    /**
     * 修改学生对象
     * @param student 要修改学生的对象
     * @return返回学生对象
     */
    @Override
    public Student upd(Student student) {
        return studentDao.save(student);
    }

    /**
     * 查询学生
     * @return 返回查询到的集合
     */
    @Override
    public List<Student> seAll() {
        return studentDao.findAll();
    }

    /**
     * 删除学生
     * @param id 要删除学生的id
     */
    @Override
    public void del(Integer id) {

        studentDao.deleteById(id);
    }

    /**
     * 根据id查询学生
     * @param id 要查询的id
     * @return
     */
    @Override
    public Student selById(Integer id) {
        return studentDao.findById(id).get();
    }

    /**
     * 分页查询
     * @param pageNum
     * @param size
     * @return
     */
    @Override
    public Page<Student> findByPage(Integer pageNum, Integer size) {
        PageRequest pageRequest = PageRequest.of(pageNum - 1, size);
        Page<Student> page= studentDao.findAll(pageRequest);
        return page;
    }
}
