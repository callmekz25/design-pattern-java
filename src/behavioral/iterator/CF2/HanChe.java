package behavioral.iterator.CF2;

import java.util.Scanner;

public class HanChe implements ATM_State{
    @Override
    public void xuLyNapTien(int soTien, ATM context) {
        context.soTien += soTien;
        if(context.soTien <= 5_000_000){
            context.setState(new HetTien());
        }

    }

    @Override
    public void xuLyRutTien(ATM context) {
        System.out.println("Nhập số tiền rút");
        Scanner scanner = new Scanner(System.in);
        int res = scanner.nextInt();
        context.soTien -= res;
        System.out.println("Số tiền rút: " + res);
        System.out.println("Số dư sau khi rút: " + context.soTien);
    }
}
