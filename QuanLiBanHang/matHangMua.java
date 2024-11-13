package QuanLiBanHang;

public class matHangMua {
    private hoaDon hd;
    private int matHangMuaId;
    private matHang mh;
    private int soLuong;

    public matHangMua(hoaDon hd, int matHangMuaId, matHang mh, int soLuong) {
        this.hd = hd;
        this.matHangMuaId = matHangMuaId;
        this.mh = mh;
        this.soLuong = soLuong;
    }

    public void themMatHangMuaCuaHoaDon() {
        if (this.soLuong < this.mh.getSoLuong()) {
            this.soLuong++;
        } else {
            System.out.println("Het hang");
        }
    }

    public hoaDon getHd() {
        return this.hd;
    }

    public int getMatHangMuaId() {
        return this.matHangMuaId;
    }

    public matHang getMh() {
        return this.mh;
    }

    public int getSoLuong() {
        return this.soLuong;
    }
}
