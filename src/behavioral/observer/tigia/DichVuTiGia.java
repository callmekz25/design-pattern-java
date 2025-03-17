package behavioral.observer.tigia;

import java.util.ArrayList;
import java.util.List;

public class DichVuTiGia implements ThayDoiTiGia {
    List<ThayDoiTiGia> nhaDauTu = new ArrayList<>();
    void dangKy(ThayDoiTiGia ndt){
        if(nhaDauTu.contains(ndt)) {
            return;
        }
        else {
            nhaDauTu.add(ndt);
        }
    };
    void huyDangKy(ThayDoiTiGia ndt){
        if(!nhaDauTu.contains(ndt)) {
            return;
        }
        else {
            nhaDauTu.remove(ndt);
        }
    };
    void thongBao(float delta) {
        for (var ndt: nhaDauTu) {
            ndt.nhanThongBao(delta);
        }
    };

    @Override
    public void nhanThongBao(float delta) {

    }
}
