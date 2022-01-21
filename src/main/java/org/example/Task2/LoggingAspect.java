package org.example.Task2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @After("execution(* org.example.Task2.University.getStudents())")
    public void afterGetStudentsAdvice() {
        System.out.println("afterGetStudentsAdvice");
    }
}