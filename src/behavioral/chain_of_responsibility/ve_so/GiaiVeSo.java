package behavioral.chain_of_responsibility.ve_so;

import java.util.ArrayList;
import java.util.List;

public abstract class GiaiVeSo {
    String tenGiai;
    List<String> soTrungThuong;


    public GiaiVeSo(String tenGiai, List<String> soTrungThuong) {
        this.tenGiai = tenGiai;
        this.soTrungThuong = soTrungThuong;
    }

    public abstract GiaiVeSo giaiKeTiep(GiaiVeSo keTiep);

    public abstract String doVeSo(String veSo);

}
