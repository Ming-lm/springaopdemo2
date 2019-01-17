package com.yujian.service;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public void insertStudent(){
        System.out.println("模拟执行插入学生的操作");
    }

    public void deleteStudent(){
        System.out.println("模拟执行删除学生的操作");

    }
    public void findStudentList(){
        System.out.println("模拟查询学生的操作");
    }
}
