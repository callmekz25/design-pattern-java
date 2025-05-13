package behavioral.observer.player;

public class Dashboard implements PlayerDataListener{
    PlayerData p;

    public Dashboard(PlayerData p) {
        this.p = p;
        p.setDashboard(this);
    }

    @Override
    public void listen(PlayerData p) {
        System.out.println(p.toString());
    }
}
