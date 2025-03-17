package creational.builder.Bill_A1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hdh;
    List<ChiTietHoaDon> cthds;

    protected HoaDon(Builder b) {
        hdh = b.hdh;
        cthds = b.cthds;
    }

    public void inHoaDon(){
        System.out.println(hdh.toString());
        for(var e: cthds) {
            System.out.println("\t");
            System.out.println( e.toString());
        }
    }

    public static  class Builder{
        HoaDonHeader hdh;
        List<ChiTietHoaDon> cthds;
        public Builder builderHoaDonHeader(String maHD, String ngayBan, String tenKH) {
            hdh = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
        public Builder addCTHD(ChiTietHoaDon cthd) {
            var newCthd = new ChiTietHoaDon("Laptop", 10, 1000, 200);
            if(cthds == null) {
                cthds = new ArrayList<>();
            }
            cthds.add(newCthd);
            return this;
        }
    }
}
