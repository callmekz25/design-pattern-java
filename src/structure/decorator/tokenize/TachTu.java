package structure.decorator.tokenize;

import java.util.ArrayList;
import java.util.List;

public class TachTu implements ITokenize{
    String str;

    public TachTu(String str) {
        this.str = str;
    }

    @Override
    public List<String> tokenize() {
        return new ArrayList<>(List.of(str.split(" ")));
    }
}
