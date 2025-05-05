package behavioral.iterator.CF2;

public class ATM {
    ATM_State state;
    int soTien;

    public ATM() {
        this.state = new HetTien();
        this.soTien = 0;
    }
    public void napTien(int soTien){
        state.xuLyNapTien(soTien, this);
        state = new SanSang();
    } public void rutTien(){
        state.xuLyRutTien(this);
    }
    public void setState(ATM_State state){
        this.state = state;
    }
}
