package structure.composite.course;



public abstract class QLHocTap {
    String name;
    String prefix = "";
    public QLHocTap(String name) {
        this.name = name;
    }

    public abstract int getSoTC();
    public abstract int getHP();
    public abstract String ThongTin();
    public abstract QLHocTap add(QLHocTap qlht);
    public abstract QLHocTap remove(QLHocTap qlht);
}
