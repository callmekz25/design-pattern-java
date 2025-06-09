package behavioral.state.thue_bao_tra_cuoc;

public class NormalStatus implements IState{
    @Override
    public void xuLyNapTien(int soTien, ThueBaoTraCuoc tb) {
        tb.soDu = tb.soDu + soTien;
        if(tb.soDu >= 100_000 && tb.soDu < 200_000) {
            tb.setState(new SilverStatus());
        }
        if(tb.soDu >= 200_000) {
            tb.setState(new GoldStatus());
        }
    }

    @Override
    public void xuLyGoiDien(int soPhut, ThueBaoTraCuoc tb) {
        int cuocGoi = 1800 * soPhut;
        tb.soDu = cuocGoi > tb.soDu ? 0 : tb.soDu - cuocGoi;
        System.out.println("Số dư thuê bao: " + tb.soDu);
        System.out.println("Trạng tháo: Thường");
    }

    @Override
    public void inThongTin(ThueBaoTraCuoc tb) {
        System.out.println("Số dư: " + tb.soDu);
        System.out.println("Trạng tháo: Thường");
        System.out.println("Thời gian gọi còn lại: " + tb.soDu / (1800 / 60) + " giây");
    }
}
