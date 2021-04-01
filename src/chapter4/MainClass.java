package chapter4;

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle(new Point(4,2),4);
        Rectangle rectangle = new Rectangle(new Point(-10,-4),10,4);
        Line line = new Line(new Point(4,1),new Point(4,-10));

        Shape line1 = new Line(line);
        ((Line)line1).setEndOfLine(new Point(1,1));
        System.out.println("Line Center: " + line.getCenter());
        System.out.println("Line1 Center: " + line1.getCenter());
    }
}
