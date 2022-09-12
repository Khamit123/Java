package ru.mirea.kvbo1.khamit;

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

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
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
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
