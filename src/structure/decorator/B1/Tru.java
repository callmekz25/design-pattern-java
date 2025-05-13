package structure.decorator.B1;

public class Tru extends BieuThucDecorator{
    float toanHang;
    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() +  " - " + toanHang;
    }
}
