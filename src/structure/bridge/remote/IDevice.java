package structure.bridge.remote;

public interface IDevice {
    int volume = 0;
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
}
