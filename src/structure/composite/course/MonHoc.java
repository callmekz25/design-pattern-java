package structure.composite.course;

public class MonHoc extends QLHocTap{
    int soTC, hocPhi;

    public MonHoc(String name, int soTC, int hocPhi) {
        super(name);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }


    @Override
    public int getSoTC() {
        return this.soTC;
    }

    @Override
    public int getHP() {
        return this.hocPhi * this.soTC;
    }

    @Override
    public String ThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.prefix);
        builder.append(this.name).append(", Số TC: " +this.getSoTC()).append(", Học phí: " + this.getHP());
        return builder.toString();
    }

    @Override
    public QLHocTap add(QLHocTap qlht) {
        return null;
    }

    @Override
    public QLHocTap remove(QLHocTap qlht) {
        return null;
    }
}
