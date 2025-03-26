package behavioral.observer.ATM;

public class TaiKhoan implements TheoDoiATM{

    private int soDu = 2000;
    private ATM atm;
    private String ten;

    public TaiKhoan(int soDu, String ten) {

        this.soDu = soDu;
        this.atm = null;
        this.ten = ten;
    }


    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong) {
            this.soDu -= soTienRut;
            System.out.println(ten + " - số tiền rút: " + soTienRut);
            return;
        }
        System.out.println("Số tiền không đủ - Số dư: " + soDu);
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        if(soTien > soDu) {
            return false;
        }
        return true;
    }
    public void duaTheVaoATM(ATM atm){
        this.atm = atm;
        this.atm.nhanThe(this);
    }
    public void rutThe(){
        atm.traThe();
    }
}
