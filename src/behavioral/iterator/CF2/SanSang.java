package behavioral.iterator.CF2;

import java.util.Scanner;

public class SanSang implements ATM_State{
    @Override
    public void xuLyNapTien(int soTien, ATM context) {
        context.soTien += soTien;
    }

    @Override
    public void xuLyRutTien(ATM context) {
        System.out.println("Lựa chọn 1. 500.000.000đ - 2. 300.000.000đ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                context.soTien -= 5_000_000;
                break;
            case 2:
                context.soTien -= 3_000_000;
                break;
            default:
                System.out.println("Lựa chọn số tiền muốn rút");
        }
        if(context.soTien < 3_000_000) {

        }
        if(context.soTien == 0) {
            context.setState(new HetTien());
        } else {
            System.out.println("Số dư sau khi rút: " + context.soTien);
        }
    }
}
