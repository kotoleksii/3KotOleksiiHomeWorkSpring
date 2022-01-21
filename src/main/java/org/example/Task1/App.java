package org.example.Task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = (User) context.getBean("user");
        user.setID(2);
        user.getID();
        user.setFirstName("Andrii");
        user.getFirstName();
        user.setLastName("Antonenko");
        user.getLastName();
        user.setPhone("380995671232");
        user.getPhone();
        user.setEmail("andant@gmail.com");
        user.getEmail();
        user.setPost("designer");
        user.getPost();

        context.close();
    }
}
