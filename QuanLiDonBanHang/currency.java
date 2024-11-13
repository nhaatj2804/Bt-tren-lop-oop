package QuanLiDonBanHang;

public class currency {
    private double amount;
    private String currencyType;

    public currency(double amount, String currencyType) {
        this.amount = amount;
        this.currencyType = currencyType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}