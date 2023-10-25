package com.olaniyi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
    private Point centre;

    public Circle(Point centre) {
        this.centre = centre;
    }

    public Point getCentre() {
        return centre;
    }


    @Autowired
    @Qualifier("circleRelated")
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println("Centre: Point is: " + centre.getX() + "," + centre.getY());
    }
}
