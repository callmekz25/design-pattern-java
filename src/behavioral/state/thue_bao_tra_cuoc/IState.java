package behavioral.state.thue_bao_tra_cuoc;

public interface IState {
    public void xuLyNapTien(int soTien, ThueBaoTraCuoc tb);

    public void xuLyGoiDien(int soPhut, ThueBaoTraCuoc tb);

    public void inThongTin(ThueBaoTraCuoc tb);
}
