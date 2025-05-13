package behavioral.observer.player;

public class PlayerData {
    private int thoiGian, countDown, grade;
    PlayerDataListener dashboard;
    public PlayerData(int thoiGian, int countDown, int grade) {
        this.thoiGian = thoiGian;
        this.countDown = countDown;
        this.grade = grade;
    }
    public void setDashboard(PlayerDataListener dashboard) {
        this.dashboard = dashboard;
    }
    @Override
    public String toString() {
        return "PlayerData{" +
                "thoiGian=" + thoiGian +
                ", countDown=" + countDown +
                ", grade=" + grade +
                '}';
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        if(dashboard != null) {
            dashboard.listen(this);
        }
    }

    public int getCountDown() {
        return countDown;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
        if(dashboard != null) {
            dashboard.listen(this);
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
        if(dashboard != null) {
            dashboard.listen(this);
        }
    }
}
