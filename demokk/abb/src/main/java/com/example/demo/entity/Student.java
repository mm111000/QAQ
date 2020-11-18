package com.example.demo.entity;

import javax.persistence.*;

/**
 * @BelongsProject: springdatajpaday1
 * @BelongsPackage: com.wentao.springdatajpaday1.pojo
 * @Author: 13274
 * @CreateTime: 2019-06-03 14:22
 * @Description: ${Description}
 */

@Entity
@Table(name = "student")
//@Data
public class Student {
    //id表示主键 主键有生成策略GenerationType.IDENTITY
    //GenerationType.AUTO
    //Oracle中是没有自动增长的设置SEQUENCE 使用序列进行增长
    //GeneratedValue自动增长生成的values的值
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;//学生id

    // @Column可以写可以不写
    @Column(name = "name")
    private String name;//姓名

    @Column
    private  String sex;//性别

    @Column
    private Integer grade_id;//年级id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getGradeId() {
        return grade_id;
    }

    public void setGradeId(Integer gradeId) {
        this.grade_id= gradeId;
    }
}

