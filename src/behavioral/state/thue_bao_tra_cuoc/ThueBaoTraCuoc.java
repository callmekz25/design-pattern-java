package behavioral.state.thue_bao_tra_cuoc;

public class ThueBaoTraCuoc {
    IState state;
    int soDu;

    public ThueBaoTraCuoc(int soDu) {
        this.soDu = soDu;
        this.state = new NormalStatus();
    }

    public void napTien(int soTien) {
        state.xuLyNapTien(soTien, this);
    }
    public void goiDien(int soPhut) {
        state.xuLyGoiDien(soPhut, this);
    }
    public void inThongTin() {
        state.inThongTin(this);
    }
    public void setState(IState state) {
        this.state = state;
    }
}
