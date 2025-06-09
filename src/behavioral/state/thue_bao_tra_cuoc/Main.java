package behavioral.state.thue_bao_tra_cuoc;

public class Main {
    public static void main(String[] args) {

        ThueBaoTraCuoc tb = new ThueBaoTraCuoc(0);
        tb.napTien(100_000);
        tb.inThongTin();
        tb.goiDien(3);
        tb.inThongTin();
    }
}
