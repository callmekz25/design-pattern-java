package behavioral.stragery.QLSV;

import java.util.List;

public class QLSV implements ISoSanh{
    ISoSanh<SinhVien> soSanh;
    List<SinhVien> dsSV;

    public QLSV(ISoSanh<SinhVien> soSanh, List<SinhVien> dsSV) {
        this.soSanh = soSanh;
        this.dsSV = dsSV;
    }

    public void sapXep(){

    }

    public void inDS() {

    }
    @Override
    public int soSanh(Object o1, Object o2) {
        return 0;
    }
}
