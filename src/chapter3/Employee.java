package chapter3;

class Employee implements Measurable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
