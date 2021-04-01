package chapter2;

public class MainClass {
    public static void main(String[] args) {
        //Point p = new Point(3,4).translate(1, 3).scale(0.5);
        //System.out.println(p.toString());

        Car car = new Car(54, 9);
        car.driveByGivenMiles(650);
        System.out.println(car.getDistance());
        System.out.println(car.getFuelLevel());
    }
}
