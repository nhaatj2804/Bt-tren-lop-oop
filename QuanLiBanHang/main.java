package QuanLiBanHang;

import java.util.*;

public class main {
    public static void main(String[] args) {
        List<khachHang> khachHangRepo = new ArrayList<khachHang>();
        List<matHang> matHangRepo = new ArrayList<matHang>();
        List<hoaDon> hoaDonRepo = new ArrayList<hoaDon>();
        List<matHangMua> matHangMuaRepo = new ArrayList<matHangMua>();
        matHang mh1 = new matHang(1000, 1, 10, "X");
        matHang mh2 = new matHang(2000, 2, 20, "Y");
        matHang mh3 = new matHang(3000, 3, 30, "Z");
        matHangRepo.add(mh1);
        matHangRepo.add(mh2);
        matHangRepo.add(mh3);
        khachHang kh1 = new khachHang("HN", "1", "Nguyen Van A");
        khachHangRepo.add(kh1);
        matHangMua mhm1 = new matHangMua(null, 1, mh1, 5);
        matHangMua mhm2 = new matHangMua(null, 2, mh2, 10);
        hoaDon hd1 = new hoaDon("1", kh1, "1/1/2020",
                mh1.getGia() * mhm1.getSoLuong() + mh2.getGia() * mhm2.getSoLuong());
        hoaDonRepo.add(hd1);
        hd1.inHoadon();

    }
}
