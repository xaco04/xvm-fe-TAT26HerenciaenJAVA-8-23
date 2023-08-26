package Ejercicio_Jobs;

public class Manager extends Employee {
    public Manager(String name, double monthlySalary) throws InvalidSalaryException {
        super(name, monthlySalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 1.10;
    }
}
