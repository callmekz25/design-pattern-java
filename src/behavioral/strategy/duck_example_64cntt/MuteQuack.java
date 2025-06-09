package behavioral.strategy.duck_example_64cntt;

public class MuteQuack implements IQuackBehavior{
    @Override
    public String quack() {
        return "Mute Quack";
    }
}
