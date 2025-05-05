package behavioral.chain_of_responsibility.tien_dien;

public class Main {
    public static void main(String[] args) {
        TienDienBacThang bac1 = new BacThongThuong("Bậc 1", 0, 50, 1806);
        TienDienBacThang bac2 = new BacThongThuong("Bậc 2", 50, 100, 1866);
        TienDienBacThang bac3 = new BacThongThuong("Bậc 3", 100, 200, 2167);
        TienDienBacThang bac4 = new BacThongThuong("Bậc 4", 200, 300, 2729);
        TienDienBacThang bac5 = new BacThongThuong("Bậc 5", 300, 400, 3050);
        TienDienBacThang bac6 = new BacCaoNhat("Bậc 6", 400, Integer.MAX_VALUE, 3151);

        bac1.bacKeTiep(bac2).bacKeTiep(bac3).bacKeTiep(bac4).bacKeTiep(bac5).bacKeTiep(bac6);

        System.out.println("Tính tiền điện của 125KW: " + bac1.tinhTienDien(125) + " VND");
    }
}
