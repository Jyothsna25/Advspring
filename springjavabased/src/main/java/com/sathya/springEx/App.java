package com.sathya.springEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// start the container...
       ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
       System.out.println( "*&*&*&*&*&" );
       
       // Get the object from container call your methods..
      
       GreetingImpl greetingImpl=context.getBean("greet",GreetingImpl.class);
       greetingImpl.greet();
   }
    }

