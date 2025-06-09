package behavioral.state.thue_bao_tra_cuoc;

public class GoldStatus implements IState{

    @Override
    public void xuLyNapTien(int soTien, ThueBaoTraCuoc tb) {
        tb.soDu = tb.soDu + (soTien * 110)/100;

    }

    @Override
    public void xuLyGoiDien(int soPhut, ThueBaoTraCuoc tb) {
        if((tb.soDu - soPhut * 1200) >= 200_000) {
            tb.soDu = tb.soDu - soPhut * 1200;
            System.out.println("Số dư thuê bao: " + tb.soDu);
            System.out.println("Trạng tháo: Vàng");
        } else if((tb.soDu - soPhut * 1500) >= 100_000) {
            int tg = soPhut * 60 - (tb.soDu - 200_000) / (1200/60);
            tb.setState(new SilverStatus());
            int cuocGoi = (1500/60) * tg;
            tb.soDu = 200_000;
            tb.soDu = cuocGoi > tb.soDu ? 0 : tb.soDu - cuocGoi;
            System.out.println("Số dư thuê bao: " + tb.soDu);
            System.out.println("Trạng tháo: Bạc");
        } else {
            int tg = soPhut * 60 - (tb.soDu - 100_000) / (1500/60) - (tb.soDu - 200_000) / (1200/60) ;
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
        System.out.println("Trạng tháo: Vàng");
        int tg = (tb.soDu - 200_000)/(1200/60) + 200_000 / (1500/60) + (tb.soDu - 100_000)/(1500/60) + 100_000 / (1800/60);
        System.out.println("Thời gian gọi còn lại: " + tg + " giây");

    }
}
