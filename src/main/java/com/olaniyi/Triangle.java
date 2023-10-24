package com.olaniyi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware {

   private Point point1;
   private  Point point2;
   private Point point3;

   private ApplicationContext context;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public  void draw() {
        System.out.println("Point 1 = " + point1.getX() + ", " + point1.getY());
        System.out.println("Point 2 = " + point2.getX() + ", " + point2.getY());
        System.out.println("Point 3 = " + point3.getX() + ", " + point3.getY());
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("BeanName is: " + beanName);

    }
}
