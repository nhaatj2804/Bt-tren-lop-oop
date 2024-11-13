package QuanLiBanHang;

public class hoaDon {
    private String hoaDonId;
    private khachHang kh;
    private String ngayBan;
    private float tongTien;

    public hoaDon(String hoaDonId, khachHang kh, String ngayBan, float tongTien) {
        this.hoaDonId = hoaDonId;
        this.kh = kh;
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
    }

    public void inHoadon() {
        System.out.println("Hoa don: " + hoaDonId);
        System.out.println("Khach hang: " + kh.getTenKhachHang());
        System.out.println("Ngay ban: " + ngayBan);
        System.out.println("Tong tien: " + tongTien);
    }

    public String getTenKhachHang() {
        return kh.getTenKhachHang();
    }

    public void themHoaDon() {

    }
}
