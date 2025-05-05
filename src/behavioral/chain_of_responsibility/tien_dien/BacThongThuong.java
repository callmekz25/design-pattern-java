package behavioral.chain_of_responsibility.tien_dien;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang bacKeTiep;
    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang keTiep) {
        this.bacKeTiep = keTiep;
        return this.bacKeTiep;
    }

    @Override
    public int tinhTienDien(int soKW) {
        if(soKW <= this.max) {
            return (soKW - this.min) * this.gia;
        } else {
            return (this.max - this.min) * this.gia + this.bacKeTiep.tinhTienDien(soKW);
        }
    }
}
