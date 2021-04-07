package chapter3;

import java.math.BigDecimal;

public class MainClass {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Art1", 200);
        Measurable emp2 = new Employee("IArt2",400);
        Measurable emp3 = new Employee("IArt3", 500);

        Measurable[] objs = {emp1, emp2, emp3};
        System.out.println(average(objs));

        System.out.println(((Employee)largest(objs)).getName());
    }

    //ex1
    public static double average(Measurable[] objects) {
        double sum = 0.0;

        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return sum / objects.length;
    }

    //ex2
    public static Measurable largest(Measurable[] objects) {
        Measurable objectWithLargest = objects[0];

        for (int i = 1; i < objects.length; i++) {
            if (new BigDecimal(objectWithLargest.getMeasure()).compareTo(new BigDecimal(objects[i].getMeasure())) < 0) {
                objectWithLargest = objects[i];
            }
        }

        return objectWithLargest;
    }

}
