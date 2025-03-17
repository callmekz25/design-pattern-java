package creational.builder.Book_A5;

public class Main {
    public static void main(String[] args) {

        Book b = new Book.Builder().buildBook("1 ngay", "Kz", 10)
                .addChuong("Chuong 1").addChuong("Chuong 2").build();
        b.inBook();
    }
}
