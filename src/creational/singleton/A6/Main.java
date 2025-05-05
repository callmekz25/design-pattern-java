package creational.singleton.A6;

public class Main {
    public static void main(String[] args) {

        DataAccess dataAccess1 = DataAccess.getInstances("dataAccess1");
        DataAccess dataAccess2 = DataAccess.getInstances("dataAccess2");
        DataAccess dataAccess3 = DataAccess.getInstances("dataAccess1");

        SanPham s1 = new SanPham("1", "Laptop", 5, 5000);
        SanPham s2 = new SanPham("2", "Phone", 2, 7000);
        SanPham s3 = new SanPham("3", "HeadPhone", 3, 2000);

        dataAccess1.add(s1);
        dataAccess1.add(s2);
        dataAccess1.add(s3);

        dataAccess1.display();
        System.out.println("------");
        dataAccess2.display();
        System.out.println("------");
        dataAccess3.display();
    }
}
