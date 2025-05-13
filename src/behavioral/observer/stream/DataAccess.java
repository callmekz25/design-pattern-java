package behavioral.observer.stream;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    MyStream<List<MonHoc>> stream;
    List<MonHoc> listMH = new ArrayList<>();

    public DataAccess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void add(MonHoc m){
       listMH.add(m);
       stream.addEvent(listMH);
    }
    public void delete(MonHoc m) {

    };
}
