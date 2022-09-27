package ru.mirea.kvbo1.khamit;
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double squar(){
        return Math.PI*Math.pow(getRadius(),2);
    }
}
