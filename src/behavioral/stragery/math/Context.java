package behavioral.stragery.math;

public class Context {
    Tinh tinhToan;

    public Context() {

    }

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b) {
        return tinhToan.tinh(a, b);
    }
}
