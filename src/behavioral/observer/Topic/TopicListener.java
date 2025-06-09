package behavioral.observer.Topic;

public interface TopicListener {
    public void updateListen(News n);
    public void insertListen(News n);
}
