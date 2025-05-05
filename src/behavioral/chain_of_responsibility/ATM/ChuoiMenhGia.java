package behavioral.chain_of_responsibility.ATM;


public class ChuoiMenhGia extends ChuoiMenhGiaFactory{
    MenhGiaATM m500 = new MenhGia(500);
    MenhGiaATM m200 = new MenhGia(200);
    MenhGiaATM m100 = new MenhGia(100);
    MenhGiaATM m50 = new MenhGia(50);
    MenhGiaATM m20 = new MenhGia(20);
    MenhGiaATM m10 = new MenhGia(10);
    MenhGiaATM m5 = new MenhGia(5);
    MenhGiaATM m2 = new MenhGia(2);
    MenhGiaATM m1 = new MenhGiaThapNhat(1);
    public ChuoiMenhGia() {

        m500.thietLapKeTiep(m200).thietLapKeTiep(m100).thietLapKeTiep(m50).thietLapKeTiep(m20)
                .thietLapKeTiep(m10).thietLapKeTiep(m5).thietLapKeTiep(m2).thietLapKeTiep(m1);
    }

    @Override
    MenhGiaATM getChuoiMenhGia(int mgLonNhat) {
        switch (mgLonNhat) {
            case 500:
                return this.m500;
            case 200:
                return this.m200;
            case 100:
                return this.m100;
            case 50:
                return this.m50;
            case 20:
                return this.m20;
            case 10:
                return this.m10;
            case 5:
                return this.m5;
            case 2:
                return this.m2;
            case 1:
                return this.m1;
        }
        return null;
    }


}
