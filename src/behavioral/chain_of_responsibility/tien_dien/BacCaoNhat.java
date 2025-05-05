package behavioral.chain_of_responsibility.tien_dien;

public class BacCaoNhat extends TienDienBacThang{
    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang keTiep) {
        return null;
    }

    @Override
    public int tinhTienDien(int soKW) {
        return (soKW - this.min)*this.gia;
    }
}
