package Ejercicio_Jobs;

public class Boss extends Employee {
    public Boss(String name, double monthlyGrossSalary) throws InvalidSalaryException {
        super(name, monthlyGrossSalary);
    }

    @Override
    public double getIRPFPercentage() {
        return 32;
    }
}

