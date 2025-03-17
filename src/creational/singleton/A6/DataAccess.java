package creational.singleton.A6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataAccess {
    private static Map<String, DataAccess> instances = new HashMap<>();


    List<SanPham> listSanPham;
    protected DataAccess(){
        listSanPham = new ArrayList<>();
    }
    public static DataAccess getInstances(String tag) {
        if(instances.get(tag) == null) {
            instances.put(tag, new DataAccess());

        }
        return instances.get(tag);
    }
     public void add(SanPham s) {
        listSanPham.add(s);
    }
    public void display() {
      for (var sp: listSanPham){
          sp.display();
      }
    }
}
