package Labs.Lab1.BaiJ3;

public class Main {
    public static void main(String[] args) {
        SinhVienIT sv1 = new SinhVienIT("Kz", "CNTT", 8.5F, 8.3F, 8.3F);
        SinhVienBiz sv2 = new SinhVienBiz("Mp", "Marketing", 9.5F, 8.7F);
        SinhVienNTU sv3 = new SinhVienNTU("Ao", "PP") {
            @Override
            public float getDiemTB() {
                return 0;
            }
        };
        sv1.inThongTin();

        sv2.inThongTin();

        sv3.inThongTin();


    }
}
