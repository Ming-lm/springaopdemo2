package com.yujian;

import com.yujian.service.ClassInfoService;
import com.yujian.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        //启动一个spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("app*.xml");
        StudentService studentService=(StudentService)applicationContext.getBean("studentService");

        studentService.insertStudent();
        studentService.deleteStudent();
        studentService.findStudentList();

        ClassInfoService classInfoService=(ClassInfoService)applicationContext.getBean("classInfoService");
        classInfoService.insertClassInfo();

    }
}
