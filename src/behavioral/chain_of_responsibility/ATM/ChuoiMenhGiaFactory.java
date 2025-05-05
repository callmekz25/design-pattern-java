package behavioral.chain_of_responsibility.ATM;

public abstract class ChuoiMenhGiaFactory {
    abstract MenhGiaATM getChuoiMenhGia(int mgLonNhat);
    void rutTien(int soTien, int mgLonNhat) {
        MenhGiaATM menhGia = getChuoiMenhGia(mgLonNhat);
        menhGia.rutTien(soTien);
    };
}
