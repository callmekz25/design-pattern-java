package structure.decorator.tokenize;

public class Main {
    public static void main(String[] args) {
        ITokenize tokens = new TachTu("Hôm nay là thứ 2 và nắng.");
        tokens = new LoaiBoDauCau(tokens);
        tokens = new LoaiBoTuDung(tokens);

        System.out.println(tokens.tokenize());
    }
}
