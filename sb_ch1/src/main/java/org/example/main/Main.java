package org.example.main;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p1 = context.getBean("parrot1",Parrot.class);
        System.out.println(p1.getName());

        Parrot p2 = context.getBean("parrot2",Parrot.class);
        System.out.println(p2.getName());

        Parrot p3 = context.getBean("parrot3",Parrot.class);
        System.out.println(p3.getName());


    }
}
