package QuanLiBanHang;

public class matHang {
    private float gia;
    private int matHangId;
    private int soLuong;
    private String tenMatHang;

    public matHang(float gia, int matHangId, int soLuong, String tenMatHang) {
        this.gia = gia;
        this.matHangId = matHangId;
        this.soLuong = soLuong;
        this.tenMatHang = tenMatHang;
    }

    public void themMatHangVaoKho() {
        this.soLuong++;
    }

    public float getGia() {
        return this.gia;
    }

    public int getMatHangId() {
        return this.matHangId;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public String getTenMatHang() {
        return this.tenMatHang;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
