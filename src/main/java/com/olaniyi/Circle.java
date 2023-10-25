package com.olaniyi;

import com.olaniyi.Shape;

public class Circle implements Shape {
    private Point centre;

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println("Centre: Point is: " + centre.getX() + "," + centre.getY());
    }
}
