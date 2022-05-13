package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("animal", Person.class);
        System.out.println("person-1: " + person);


        Person person1 = context.getBean("animal1", Person.class);
        System.out.println("person-2: " + person1);


        context.close();
    }
}
