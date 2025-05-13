package structure.decorator.B1;

public class Chia extends BieuThucDecorator{
    int toanHang;
    public Chia(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + super.bieuThuc() + ")" + " / " + toanHang ;
    }
}
