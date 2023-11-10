public class Sach {
    private String tieuDe;
    private String tacGia;
    private String theLoai;
    private String ngayXuatban;

    Sach(String tieuDe, String tacGia, String theLoai, String ngayXuatban) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.ngayXuatban = ngayXuatban;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setNgayXuatban(String ngayXuatban) {
        this.ngayXuatban = ngayXuatban;
    }
    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getNgayXuatban() {
        return ngayXuatban;
    }
}