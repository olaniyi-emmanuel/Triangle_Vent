package com.olaniyi;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
    public static void main(String[] args) {
        //Triangle triangle = new Triangle();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Triangle triangle = (Triangle) context.getBean("triangle1");
        triangle.draw();
    }
}
