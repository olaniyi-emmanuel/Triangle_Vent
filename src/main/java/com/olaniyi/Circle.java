package com.olaniyi;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class Circle implements Shape {
    private Point centre;
    @Autowired
    @Qualifier("myMessages")
    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCentre() {
        return centre;
    }


    @Resource(name = "point2")
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public void draw() {
        System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Greeting", null));
        System.out.println("Centre: Point is: " + centre.getX() + "," + centre.getY());
        System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
    }

    @PostConstruct
    public void initializedCircle(){
        System.out.println("Initializing Circle");
    }
    @PreDestroy
    public void destroyingCircle () {
        System.out.println("Destroying Circle");
    }
}
