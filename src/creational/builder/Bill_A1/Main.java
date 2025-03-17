package creational.builder.Bill_A1;

public class Main {
    public static void main(String[] args) {
        ChiTietHoaDon cthd = new ChiTietHoaDon("Laptop", 10, 1000, 200);
        ChiTietHoaDon newCthd = new ChiTietHoaDon("Phone", 10, 2000, 400);
        HoaDon hd = new HoaDon.Builder()
                .builderHoaDonHeader("HD1", "4/3/2024", "Kz")
                .addCTHD(cthd).addCTHD(newCthd).build();
        hd.inHoaDon();
    }
}
