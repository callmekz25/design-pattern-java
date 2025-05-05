package behavioral.chain_of_responsibility.ATM;

public abstract class MenhGiaATM {
    int giaTri;

    public MenhGiaATM(int giaTri) {
        this.giaTri = giaTri;
    }

    public abstract MenhGiaATM thietLapKeTiep(MenhGiaATM keTiep);
    public abstract void rutTien(int soTien);
}
