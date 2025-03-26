package behavioral.observer.ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk = new TaiKhoan(3000, "Kz");
        tk.duaTheVaoATM(atm);
        atm.rutTien(2000);
        atm.rutTien(2000);
        tk.rutThe();
        atm.rutTien(3000);
    }
}
