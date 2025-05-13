package behavioral.observer.stream;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
        MonHoc m1 = new MonHoc("LTTBDD");
        MonHoc m2 = new MonHoc("KTTKPM");
        Client client1 = new Client(stream, "client1");
        Client client2 = new Client(stream, "client2");
        System.out.println("1");
        dataAccess.add(m1);
        System.out.println("2");
        dataAccess.add(m2);



    }
}
