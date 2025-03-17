package Labs.Lab1.BaiJ3;

public class SinhVienBiz extends SinhVienNTU{
    private float diemMarketing, diemSales;

    public SinhVienBiz(String hoTen, String nganh) {
        super(hoTen, nganh);
    }

    public SinhVienBiz(String hoTen, String nganh, float diemMarketing, float diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }


    @Override
    public float getDiemTB() {
        return (this.diemMarketing * 2 + this.diemSales) / 3;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Marketing: " + this.diemMarketing + " " + "Sales: " + this.diemSales);
        System.out.println(this.getDiemTB());
        System.out.println(this.getHocLuc());
    }
}
