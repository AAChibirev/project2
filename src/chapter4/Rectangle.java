package chapter4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    //for copy
    public Rectangle(Rectangle rectangle) {
        super(new Point(rectangle.getPoint()));
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Point getCenter() {
        double newX = getPoint().getX() + width / 2;
        double newY = getPoint().getY() + height / 2;
        return new Point(newX, newY);
    }

    @Override
    public String toString() {
        return "Rectangle{TopLeft" + getPoint() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Point getTopLeftPoint() {
        return getPoint();
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
