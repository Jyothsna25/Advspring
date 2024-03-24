package com.sathya.springEx.javabased2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(javaconfig.class);
        
        student student=context.getBean("student",student.class);
        student.details();
    }
}
