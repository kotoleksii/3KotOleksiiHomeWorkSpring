package org.example.Task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.createStudents();

        System.out.println("before");
        List<Student> students = university.getStudents();
        System.out.println("after");

        context.close();
    }
}
