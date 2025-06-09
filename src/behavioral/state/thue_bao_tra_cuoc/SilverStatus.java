package behavioral.state.thue_bao_tra_cuoc;

public class SilverStatus implements IState{
    @Override
    public void xuLyNapTien(int soTien, ThueBaoTraCuoc tb) {
        tb.soDu = tb.soDu + (soTien * 105)/100;
        if(tb.soDu >= 200_000) {
            tb.setState(new GoldStatus());
        }
    }

    @Override
    public void xuLyGoiDien(int soPhut, ThueBaoTraCuoc tb) {
        if((tb.soDu - soPhut * 1500) >= 100_000) {
            tb.soDu = tb.soDu - soPhut * 1500;
            System.out.println("Số dư thuê bao: " + tb.soDu);
            System.out.println("Trạng tháo: Bạc");
        } else {
            int tg = soPhut * 60 - (tb.soDu - 100_000) / (1500/60);
            tb.setState(new NormalStatus());
            int cuocGoi = (1800/60) * tg;
            tb.soDu = 100_000;
            tb.soDu = cuocGoi > tb.soDu ? 0 : tb.soDu - cuocGoi;
            System.out.println("Số dư thuê bao: " + tb.soDu);
            System.out.println("Trạng tháo: Thường");
        }

    }

    @Override
    public void inThongTin(ThueBaoTraCuoc tb) {
        System.out.println("Số dư: " + tb.soDu);
        System.out.println("Trạng tháo: Bạc");
        int tg = (tb.soDu - 100_000)/(1500/60) + 100_000 / (1800/60);
        System.out.println("Thời gian gọi còn lại: " + tg + " giây");
    }
}
