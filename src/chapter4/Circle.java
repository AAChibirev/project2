package chapter4;

public class Circle extends Shape {

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    //for copy
    public Circle(Circle circle) {
        super(new Point(circle.getPoint()));
        this.radius = circle.radius;
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }

    @Override
    public String toString() {
        return "Circle{" +
                getPoint() +
                ", radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
