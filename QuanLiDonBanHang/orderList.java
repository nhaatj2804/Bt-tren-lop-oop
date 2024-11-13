package QuanLiDonBanHang;

import java.util.*;

public class orderList {
    private static List<order> orderList;

    public orderList() {
        orderList = new ArrayList<order>();
    }

    public void add(order order) {
        orderList.add(order);
    }

    public void remove(order order) {
        orderList.remove(order);
    }

    public void getCount() {
        System.out.println("Number of orders: " + orderList.size());
    }

    // public orderIterator iterator() {

    // }

}
