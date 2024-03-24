package com.sathya.springEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //start the container...
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring-configi.xml");
    	//Get the Bean...
    	traveller traveller=context.getBean("traveller",traveller.class);
    	traveller.startjourney();
    }
}
