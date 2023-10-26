package com.olaniyi;


import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
    private Point centre;

    public Point getCentre() {
        return centre;
    }


    @Resource(name = "point2")
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println("Centre: Point is: " + centre.getX() + "," + centre.getY());
    }
}
