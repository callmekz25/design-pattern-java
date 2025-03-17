package creational.builder.Book_A5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuaDe, tacGia;
    int soTrang;
    List<String> chuong;

    protected Book(Builder b) {
        this.tuaDe = b.tuaDe;
        this.tacGia = b.tacGia;
        this.soTrang = b.soTrang;
        this.chuong = b.chuong;
    }

    public void inBook() {
        System.out.println(this.tuaDe);
        System.out.println(this.tacGia);
        System.out.println(this.soTrang);
        for (var e: chuong) {
            System.out.println(e);
        }

    }

    public static class Builder{
        String tuaDe, tacGia;
        int soTrang;
        List<String> chuong;
        public Builder buildBook(String tuaDe, String tacGia, int soTrang){
            this.tuaDe = tuaDe;
            this.soTrang = soTrang;
            this.tacGia = tacGia;
            return this;
        }
        public Builder addChuong(String c) {
            String newChuong = c;
            if(chuong == null) {
                chuong = new ArrayList<>();
            }
            chuong.add(newChuong);
            return  this;
        }
        public  Book build() {
            return new Book(this);
        }
    }
}
