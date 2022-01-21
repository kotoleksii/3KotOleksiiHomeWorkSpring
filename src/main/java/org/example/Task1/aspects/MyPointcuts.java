package org.example.Task1.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* org.example.Task1.User.*(..))")
    public void allMethodsFromUser() {
    }

    @Pointcut("execution(* org.example.Task1.User.getPhone())")
    public void getPhoneFromUser() {
    }

    @Pointcut("execution(* org.example.Task1.User.getEmail())")
    public void getEmailFromUser() {

    }
}
