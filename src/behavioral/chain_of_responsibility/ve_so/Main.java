package behavioral.chain_of_responsibility.ve_so;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GiaiVeSo giaiDacBiet = new GiaiConLai("Giải đặc biệt", List.of("1234"));
        GiaiVeSo giaiNhat = new GiaiConLai("Giải nhất", List.of("8941"));
        GiaiVeSo giaiNhi = new GiaiConLai("Giải nhì", List.of("3345"));
        GiaiVeSo giaiBa = new GiaiConLai("Giải ba", List.of("3216"));
        GiaiVeSo giaiTam = new GiaiTam("Giải tám", List.of("2145", "1785", "5691"));

        giaiDacBiet.giaiKeTiep(giaiNhat).giaiKeTiep(giaiNhi).giaiKeTiep(giaiBa).giaiKeTiep(giaiTam);

        System.out.println(giaiDacBiet.doVeSo("1785"));
    }
}
