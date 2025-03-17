package structure.bridge.remote;

public class TV implements IDevice{
    private int volume = 0;
    private boolean enable = false;
    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        enable = true;
        System.out.println("Mở TV");
    }

    @Override
    public void disable() {
        enable = false;
        System.out.println("Tắt TV");
    }

    @Override
    public int getVolume() {
        return volume;
    }



    @Override
    public void setVolume(int percent) {
        volume = percent;
    }
}
