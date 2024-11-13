package QuanLiDonBanHang;

import java.util.*;

public class order {
    private customer customer;
    private List<orderLine> orderLine;
    private String orderCode;

    public order(customer customer, String orderCode) {
        this.customer = customer;
        this.orderLine = new ArrayList<orderLine>();
        this.orderCode = orderCode;
    }

    public orderLine addLine(orderLine orderLine) {
        this.orderLine.add(orderLine);
        return orderLine;
    }

    public void removeLine(orderLine orderLine) {
        this.orderLine.remove(orderLine);
    }

    public List<orderLine> getLines() {
        return orderLine;
    }

}
