package structure.composite.course;

public class Main {
    public static void main(String[] args) {
        ChuongTrinhHoc cth = new ChuongTrinhHoc("Khóa Công Nghệ Thông Tin");
        ChuongTrinhHoc nam = new ChuongTrinhHoc("Năm 2024-2025");
        ChuongTrinhHoc ky1 = new ChuongTrinhHoc("Kỳ 1");
        ChuongTrinhHoc ky2 = new ChuongTrinhHoc("Kỳ 2");

        MonHoc monPython = new MonHoc("Python", 3, 500);
        MonHoc monJava = new MonHoc("Java", 3, 500);
        MonHoc monLSD = new MonHoc("LSD", 2, 250);
        MonHoc monPLDC = new MonHoc("PLDC", 2, 250);
        MonHoc monMobile = new MonHoc("Mobile", 4, 500);

        cth.add(nam);
        nam.add(ky1);
        nam.add(ky2);
        ky1.add(monJava);
        ky1.add(monPython);
        ky1.add(monLSD);
        ky2.add(monPLDC);
        ky2.add(monMobile);
        System.out.println(cth.ThongTin());
    }
}
