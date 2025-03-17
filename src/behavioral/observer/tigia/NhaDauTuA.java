package behavioral.observer.tigia;

public class NhaDauTuA extends NhaDauTu{
    public NhaDauTuA(String ten, DichVuTiGia dvtg) {
        super(ten, dvtg);
    }
    @Override
    public void nhanThongBao(float delta) {
        if(delta >= 0) {
            System.out.println(ten + " Bán ra" + delta);
        } else {
            System.out.println(ten + " Bán vào" + delta);
        }
    }
}
