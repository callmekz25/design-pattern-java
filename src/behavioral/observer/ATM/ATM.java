package behavioral.observer.ATM;

public class ATM {
    TheoDoiATM theATM;

    public void nhanThe(TheoDoiATM atm){
        this.theATM = atm;
    }
    public void traThe(){
        this.theATM = null;
        System.out.println("Trả thẻ");
    }
    public void rutTien(int soTien) {
        if(this.theATM == null) {
            System.out.println("Vui lòng bỏ thẻ vào");
            return;
        }
        if(this.theATM.kiemTraSoDu(soTien) == false) {
            theATM.nhanThongBao(soTien, false);
            return;
        }

        theATM.nhanThongBao(soTien, true);
    }
}
