package QuanLiDonBanHang;

import java.util.*;

public class orderIterator implements Iterator<orderLine> {
    private order order;
    private int index;

    public orderIterator(order order) {
        this.order = order;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < order.getLines().size();
    }

    @Override
    public orderLine next() {
        return order.getLines().get(index++);
    }

}
