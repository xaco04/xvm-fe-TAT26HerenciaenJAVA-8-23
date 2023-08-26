package Ejercicio_Jobs;

public class Mid extends Employee {
    public Mid(String name, double monthlyGrossSalary) throws InvalidSalaryException {
        super(name, monthlyGrossSalary);
    }

    @Override
    public double getIRPFPercentage() {
        return 15;
    }
}
