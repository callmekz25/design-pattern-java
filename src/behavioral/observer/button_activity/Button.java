package behavioral.observer.button_activity;

public class Button {
    MyClickListener activity;

    public Button() {
    }

    public void setListener(MyClickListener listener) {
        this.activity = listener;
    }
    public void click() {
        activity.click();
    }
}
