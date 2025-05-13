package behavioral.stragery.math;

public class Main {
    public static void main(String[] args) {


        Context context = new Context();
        context.setTinhToan(new Cong());
        System.out.println(context.tinh(1, 1));
        context.setTinhToan(new Tru());
        System.out.println(context.tinh(1, 1));
        context.setTinhToan(new Nhan());
        System.out.println(context.tinh(2, 3));
        context.setTinhToan(new Chia());
        System.out.println(context.tinh(6, 2));
    }
}
