package com.sathya.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
        
         person person =context.getBean("person",person.class);
         person.details();
    }
  
}
