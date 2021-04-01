package chapter4;

public abstract class Shape {
    private Point point;

    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    public Point getPoint(){
        return point;
    }

    public abstract Point getCenter();

    public abstract String toString();

}
