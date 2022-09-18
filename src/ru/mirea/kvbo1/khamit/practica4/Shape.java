package ru.mirea.kvbo1.khamit.practica4;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public String getType() {
        return "dsa";
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public abstract String toString();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();
}

class Circle1 extends Shape {
    protected double radius;

    public Circle1(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1() {
    }


    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

}
class Square extends Rectangle{


    public Square() {
    }

    public Square(double side) {
        super(side,side);

    }
    public Square (double side,String color, boolean filled){
        super(color,filled,side,side);
    }
public double getSide(){
        return width;
}
public void setSide(double side){
        setLength(side);
        setWidth(side);
}

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
