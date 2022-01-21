package org.example.Task1.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("org.example.Task1.aspects.MyPointcuts.allMethodsFromUser() &&" +
            " !(org.example.Task1.aspects.MyPointcuts.getPhoneFromUser() ||" +
            " org.example.Task1.aspects.MyPointcuts.getEmailFromUser())")
    public void beforeAllMethodsWithoutGetPhoneGetEmailAdvice() {
        System.out.println("All without getPhone and getEmail");
    }
}
