package com.example.demo.service;

/**
 * @BelongsProject: springdatajpaday1
 * @BelongsPackage: com.wentao.springdatajpaday1.service
 * @Author: 13274
 * @CreateTime: 2019-06-03 14:36
 * @Description: ${Description}
 */
import org.springframework.data.domain.Page;
import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 增加学生的方法
     * @param student 要增加学生的对象
     * @return 返回学生对象
     */
    Student add(Student student);

    /**
     * 修改学生的对象
     * @param student 要增加学生的对象
     * @return 返回学生对象
     */
    Student  upd(Student student);

    /**
     * 查询学生对象
     * @return 返回查询到集合
     */
    List<Student> seAll();

    /**
     * 删除学生的对象
     * @param id 要删除学生的id
     * @return 返回学生对象
     */
    void del(Integer id);

    /**
     * 根据id查询学生对象
     * @param id 要查询的id
     * @return 返回查询的对象
     */
    Student selById(Integer id);

    /**
     * 分页查询
     * @param pageNum
     * @param size
     * @return
     */
    Page<Student> findByPage(Integer pageNum, Integer size);
}


