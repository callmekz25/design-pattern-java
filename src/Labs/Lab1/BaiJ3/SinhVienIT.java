package Labs.Lab1.BaiJ3;

public class SinhVienIT extends SinhVienNTU {
    private float diemJava, diemCSS, diemHTML;

    public SinhVienIT(String hoTen, String nganh) {
        super(hoTen, nganh);
    }

    public SinhVienIT(String hoTen, String nganh, float diemJava, float diemCSS, float diemHTML) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public float getDiemTB() {
        return (this.diemJava * 2 + this.diemCSS + this.diemHTML) / 4;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Java: " + this.diemJava + " " + "CSS: " + this.diemCSS + " " + "HTML:" + this.diemHTML);
        System.out.println(this.getDiemTB());
        System.out.println(this.getHocLuc());
    }
}
