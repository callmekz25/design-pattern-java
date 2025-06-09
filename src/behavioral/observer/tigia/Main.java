package behavioral.observer.tigia;

public class Main {
    public static void main(String[] args) {
        DichVuTiGia dvtg = new DichVuTiGia();
        NhaDauTu ndtA = new NhaDauTuA("Kz", dvtg);
        NhaDauTu ndtB = new NhaDauTuB("Kv", dvtg);
        ndtA.dangKy();
        ndtB.dangKy();
        dvtg.nhanThongBao(10 );

        ndtA.huyDangKy();
        dvtg.nhanThongBao(20);
    }
}
