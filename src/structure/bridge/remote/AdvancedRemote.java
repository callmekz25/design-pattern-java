package structure.bridge.remote;

public class AdvancedRemote extends Remote{
    private int volumeMemo;
    private boolean isMuted = false;
    public AdvancedRemote(IDevice device) {
        super(device);
    }
    public void mute() {
        if(isMuted) {
            this.getDevice().setVolume(volumeMemo);
            System.out.println(this.getDevice().getVolume());
            isMuted = false;
        } else {
            volumeMemo = this.getDevice().getVolume();
            this.getDevice().setVolume(0);
            System.out.println(this.getDevice().getVolume());
            isMuted = true;
        }
    }
}
