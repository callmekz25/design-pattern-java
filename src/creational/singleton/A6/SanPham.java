package creational.singleton.A6;

public class SanPham {
    String id, ten;
    int sl;
    int donGia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public SanPham(String id, String ten, int sl, int donGia) {
        this.id = id;
        this.ten = ten;
        this.sl = sl;
        this.donGia = donGia;
    }
    public void display() {
        System.out.println("id: " + id + "\tten: " + ten + "\tsl: " + sl + "\tdonGia: " + donGia);
    }
}
