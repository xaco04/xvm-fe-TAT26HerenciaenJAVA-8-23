package Ejercicio_Jobs;

public class Volunteer extends Employee {
    private static final double MAX_GOVERNMENT_AID = 300;

    public Volunteer(String name) throws InvalidSalaryException {
        super(name, 0);
        this.isVolunteer = true;
        this.annualGrossSalary = MAX_GOVERNMENT_AID * 12;
        this.annualNetSalary = MAX_GOVERNMENT_AID * 12;
        this.monthlyNetSalary = MAX_GOVERNMENT_AID;
        this.monthlyGrossSalary = MAX_GOVERNMENT_AID;
    }
}

