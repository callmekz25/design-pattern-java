package structure.decorator.tokenize;

import java.util.ArrayList;
import java.util.List;

public class LoaiBoDauCau extends TokenDecorator{
    public LoaiBoDauCau(ITokenize tokens) {
        super(tokens);
    }

    @Override
    public List<String> tokenize() {
        return new ArrayList<>(super.tokenize().stream().map(s -> s.replaceAll("\\p{Punct}", "")).toList());
    }
}
