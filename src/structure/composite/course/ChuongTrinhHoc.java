package structure.composite.course;

import java.util.ArrayList;
import java.util.List;

public  class ChuongTrinhHoc extends QLHocTap {

    List<QLHocTap> dsqlht = new ArrayList<>();
    public ChuongTrinhHoc(String name) {
        super(name);
    }

    @Override
    public int getSoTC() {
        int result = 0;
        for (var item: dsqlht) {
            result += item.getSoTC();
        };
        return result;
    }

    @Override
    public int getHP() {
        int result = 0;
        for (var item: dsqlht) {
            result += item.getHP();
        };
        return result;
    }

    @Override
    public String ThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.prefix);
        builder.append(name).append("\tTổng TC: " + this.getSoTC()).append("\tHọc phí: " + this.getHP());
        for (var item: dsqlht) {

            builder.append("\n");
            builder.append(item.ThongTin());
        }
        return builder.toString();
    }

    @Override
    public QLHocTap add(QLHocTap qlht) {
        if(dsqlht.contains(qlht)) {
            return this;
        }
        dsqlht.add(qlht);
        qlht.prefix = this.prefix + "\t";
        return qlht;
    }

    @Override
    public QLHocTap remove(QLHocTap qlht) {
        if(!dsqlht.contains(qlht)) {
            return this;
        }
        dsqlht.remove(qlht);
        return qlht;
    }
}
