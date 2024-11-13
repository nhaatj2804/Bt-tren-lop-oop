package SalaryCalculator;

public class partTimeEmployee extends Employee {
    private int workingHours;

    public partTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return this.getPaymentPerHour() * this.workingHours;
    }

}
