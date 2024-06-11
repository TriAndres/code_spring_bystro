package org.example.main;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext
                (ProjectConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println("Person name: " + person.getName());
        System.out.println("Person parrot: " + person.getParrot());
    }
}