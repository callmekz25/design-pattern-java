package structure.bridge.remote;

public class Remote {
    public IDevice getDevice() {
        return device;
    }

    private IDevice device;

    public Remote(IDevice device) {
        this.device = device;
    }

    public void togglePower() {
        if(device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }
    public void volumeDown() {
        if(device.isEnabled()) {

            if(device.getVolume() > 0) {
                device.setVolume(device.getVolume()-1);
            }
            System.out.println(device.getVolume());
        }
    }
    public void volumeUp() {
        if(device.isEnabled()) {
            if(device.getVolume() < 100) {
                device.setVolume(device.getVolume()+1);
            }
            System.out.println(device.getVolume());
        }
    }
}
