package org.example.Task2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void createStudents() {
        students.add(new Student("Ivan Ivanov", 1, 5.5));
        students.add(new Student("Stepan Stepanov", 2, 7.5));
        students.add(new Student("Sidr Sidorov", 3, 9.6));
    }

    public List<Student> getStudents() {
        System.out.println("getStudents()");
        System.out.println(2 / 0);
        System.out.println(students);
        return students;
    }
}
