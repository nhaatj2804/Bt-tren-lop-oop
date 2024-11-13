package SalaryCalculator;

public class fullTimeEmployee extends Employee {

    public fullTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return this.getPaymentPerHour() * 8;
    }

}
