package behavioral.chain_of_responsibility.ATM;

public class MenhGia extends MenhGiaATM{
    MenhGiaATM keTiep;
    public MenhGia(int giaTri) {
        super(giaTri);
    }

    @Override
    public MenhGiaATM thietLapKeTiep(MenhGiaATM keTiep) {
        this.keTiep = keTiep;
        return this.keTiep;
    }

    @Override
    public void rutTien(int soTien) {

        int soTo = soTien / this.giaTri;
        int soDu = soTien % this.giaTri;
        if(soTo > 0) {
            System.out.println(soTo + " tờ mệnh giá " + this.giaTri);
        }
        if(soDu > 0) {
            this.keTiep.rutTien(soDu);
        }



    }
}
