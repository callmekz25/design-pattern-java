package behavioral.observer.player;

public class Main {
    public static void main(String[] args) {
        PlayerData p1 = new PlayerData(10,3,0);

        Dashboard dashboard = new Dashboard(p1);
        p1.setGrade(10);
        p1.setCountDown(2);
        p1.setCountDown(1);
    }
}
