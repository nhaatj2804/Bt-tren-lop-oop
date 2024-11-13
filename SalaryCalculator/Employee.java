package SalaryCalculator;

public class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    // setName
    public void setName(String name) {
        this.name = name;
    }

    // getName
    @Override
    public String getName() {
        return this.name;
    }

    // setPaymentPerHour
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    // getPaymentPerHour
    public int getPaymentPerHour() {
        return this.paymentPerHour;
    }

    @Override
    public int calculateSalary() {
        return 0;
    }

}
