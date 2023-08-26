package Ejercicio_Jobs;

public class Senior extends Employee {
    public Senior(String name, double monthlyGrossSalary) throws InvalidSalaryException {
        super(name, monthlyGrossSalary);
    }

    @Override
    public double getIRPFPercentage() {
        return 24;
    }
}
