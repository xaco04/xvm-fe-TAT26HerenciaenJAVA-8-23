package Ejercicio_Jobs;

public class Employee {
    protected String name;
    protected double monthlyGrossSalary;
    protected double annualGrossSalary;
    protected double monthlyNetSalary;
    protected double annualNetSalary;
    protected boolean isVolunteer = false;

    public Employee(String name, double monthlyGrossSalary) throws InvalidSalaryException {
        this.name = name;
        this.monthlyGrossSalary = monthlyGrossSalary;
        this.annualGrossSalary = monthlyGrossSalary * 12;
        calculateNetSalary();
    }

    public double calculateNetSalary() {
        double irpfPercentage = getIRPFPercentage();
        double irpfAmount = annualGrossSalary * irpfPercentage / 100;
        this.annualNetSalary = annualGrossSalary - irpfAmount;
        this.monthlyNetSalary = annualNetSalary / 12;
        return monthlyNetSalary;
    }

    public double getIRPFPercentage() {
        return 0;
    }

    public void issueBonus() {
        if (!isVolunteer) {
            double bonus = annualGrossSalary * 0.10;
            this.annualGrossSalary += bonus;
            calculateNetSalary();
        }
    }

    public String getName() {
        return name;
    }

    public double getMonthlyGrossSalary() {
        return monthlyGrossSalary;
    }

    public double getAnnualGrossSalary() {
        return annualGrossSalary;
    }

    public double getMonthlyNetSalary() {
        return monthlyNetSalary;
    }

    public double getAnnualNetSalary() {
        return annualNetSalary;
    }

	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
