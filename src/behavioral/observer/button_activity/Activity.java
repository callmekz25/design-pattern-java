package behavioral.observer.button_activity;

public class Activity implements MyClickListener{
    private int count = 0;
    Button button;

    public Activity(Button button) {
        button.setListener(this);
        this.button = button;
    }

    @Override
    public void click() {
        count++;
        System.out.println("Da click lan thu: " + count);

    }
}
