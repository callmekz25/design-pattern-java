package structure.bridge.remote;

public class Main {
    public static void main(String[] args) {
        AdvancedRemote adr = new AdvancedRemote(new TV());
        adr.togglePower();
        for (int i = 0; i < 10; i++) {
            adr.volumeUp();
        }
        adr.mute();
        adr.mute();

    }
}
