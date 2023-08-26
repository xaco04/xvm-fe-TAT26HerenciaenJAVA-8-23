package Ejercicio_Jobs;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        try {
            employees[0] = new Boss("Xavi", 9000);
            employees[1] = new Manager("Mar", 4000);
            employees[2] = new Senior("Quim", 3500);
            employees[3] = new Mid("Adria", 2200);
            employees[4] = new Junior("Victor", 1200);

            for (Employee employee : employees) {
                System.out.println("Empleados: " + employee.getName());
                System.out.println("Salario bruto mensual: " + employee.getMonthlyGrossSalary());
                System.out.println("Salario bruto anual: " + employee.getAnnualGrossSalary());
                System.out.println("Salario neto mensual: " + employee.getMonthlyNetSalary());
                System.out.println("Salario neto anual: " + employee.getAnnualNetSalary());
                employee.issueBonus();
                System.out.println("Salario Bruto Anual (después de bonificación): " + employee.getAnnualGrossSalary());
                System.out.println("--------");
            }
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

