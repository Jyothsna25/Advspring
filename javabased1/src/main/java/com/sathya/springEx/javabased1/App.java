package com.sathya.springEx.javabased1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//START THE CONTAINER..
        ApplicationContext context= new AnnotationConfigApplicationContext(Javaconfig.class);
        System.out.println( "*&*&*&*&*&" );
        //GET THE   BEAN...
        person person=context.getBean("person1",person.class);
        person.personinfo();
        person person2=context.getBean("person2",person.class);
        person2.personinfo();
        person person3=context.getBean("person3",person.class);
        person3.personinfo();
    }
}
