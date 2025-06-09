package behavioral.chain_of_responsibility.ve_so;

import java.util.List;

public class GiaiTam extends GiaiVeSo{


    public GiaiTam(String tenGiai, List<String> soTrungThuong) {
        super(tenGiai, soTrungThuong);
    }

    @Override
    public GiaiVeSo giaiKeTiep(GiaiVeSo keTiep) {
        return null;
    }

    @Override
    public String doVeSo(String veSo) {
        for (String so: soTrungThuong) {
            if(veSo.endsWith(so)){
                return "Chúc mừng trúng: " + tenGiai;
            }
        }
        return "Không trúng giải nào";
    }
}
