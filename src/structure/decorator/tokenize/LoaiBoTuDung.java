package structure.decorator.tokenize;

import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
    public LoaiBoTuDung(ITokenize tokens) {
        super(tokens);
    }
    List<String> tuDungs = List.of("thì", "và", "là", "bị", "vì", "mà", "nên");

    @Override
    public List<String> tokenize() {
        List<String> t = tokens.tokenize();
        t.removeAll(tuDungs);
        return t;
    }
}
