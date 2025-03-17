package Labs.Lab1.BaiJ3;

public abstract class SinhVienNTU {
    private String hoTen;
    private String nganh;

    public  SinhVienNTU(String hoTen, String nganh) {

        this.nganh = nganh;
        this.hoTen = hoTen;
    }
    public abstract float getDiemTB();

    public String getHocLuc() {
        if(getDiemTB() >= 9) {
            return "Xuất sắc";
        }
        if(getDiemTB() >= 8) {
            return "Giỏi";
        }
        if(getDiemTB() >= 7) {
            return "Khá";
        }
        if(getDiemTB() >= 5) {
            return "Trung bình";
        }
        return "Yếu";


    }
    public void inThongTin(){
        System.out.println("Ho ten: " + this.hoTen + " " + "Nganh" + this.nganh);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
}
