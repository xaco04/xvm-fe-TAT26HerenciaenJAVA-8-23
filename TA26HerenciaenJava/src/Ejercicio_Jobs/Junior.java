package Ejercicio_Jobs;

public class Junior extends Employee {
    public Junior(String name, double monthlyGrossSalary) throws InvalidSalaryException {
        super(name, monthlyGrossSalary);
    }

    @Override
    public double getIRPFPercentage() {
        return 2;
    }
}
