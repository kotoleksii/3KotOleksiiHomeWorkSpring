package org.example.Task1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
@ComponentScan("org.example")
@EnableAspectJAutoProxy
public class MyConfig {

}