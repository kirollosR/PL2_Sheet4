package com.jetbrains;

import java.util.*;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this(0,0);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double distance(MyPoint p){
        return Math.sqrt(Math.pow(p.getX()-this.x, 2) +
                          Math.pow(p.getY()-this.y, 2));
    }

    public double distance(double x,double y){
        return distance(new MyPoint(x,y));
    }

    public static double distance(MyPoint p1, MyPoint p2){
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) +
                         Math.pow(p1.getY() - p2.getY(), 2));
    }
}
