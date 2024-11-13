package QuanLiDonBanHang;

public class orderLine {
    private String product;
    private int quantity;
    private currency value;

    public orderLine(String product, int quantity, currency price) {
        this.product = product;
        this.quantity = quantity;
        this.value = price;
    }

    public double getTotal() {
        return quantity * value.getAmount();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return value.getAmount();
    }

    public void setPrice(currency price) {
        this.value = price;
    }
}
