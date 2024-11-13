package QuanLiBanHang;

class khachHang {
    private String diachi;
    private String khachHangId;
    private String tenKhachHang;

    public khachHang(String diachi, String khachHangId, String tenKhachHang) {
        this.diachi = diachi;
        this.khachHangId = khachHangId;
        this.tenKhachHang = tenKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }
}
