package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class GiaiConLai extends GiaiVeSo{

    GiaiVeSo giaiKeTiep;

    public GiaiConLai(String tenGiai, List<String> soTrungThuong) {
        super(tenGiai, soTrungThuong);
    }


    @Override
    public GiaiVeSo giaiKeTiep(GiaiVeSo keTiep) {
        this.giaiKeTiep = keTiep;
        return this.giaiKeTiep;
    }

    @Override
    public String doVeSo(String veSo) {
        for (String so: soTrungThuong) {
            if(veSo.endsWith(so)){
                return "Chúc mừng trúng: " + tenGiai;
            }
        }
        return giaiKeTiep.doVeSo(veSo);
    }
}
