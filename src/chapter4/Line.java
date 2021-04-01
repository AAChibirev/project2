package chapter4;

public class Line extends Shape {
    private Point endOfLine;

    public Line(Point startOfLine, Point endOfLine) {
        super(startOfLine);
        this.endOfLine = endOfLine;
    }

    //for copy
    public Line(Line line) {
        super(new Point(line.getPoint()));
        this.endOfLine = new Point(line.endOfLine);
    }

    public Point getCenter() {
        double newX = ((getPoint().getX() + endOfLine.getX())) / 2;
        double newY = ((getPoint().getY() + endOfLine.getY())) / 2;

        return new Point(newX, newY);
    }

    @Override
    public String toString() {
        return "Line{start" +getPoint() +
                ", end" + endOfLine +
                '}';
    }

    public Point getEndOfLine() {
        return endOfLine;
    }

    public Point getStartOfLine() {
        return getPoint();
    }

    public void setEndOfLine(Point endOfLine) {
        this.endOfLine = endOfLine;
    }
}
