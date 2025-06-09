package behavioral.observer.Topic;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<News> news = new ArrayList<>();
    private int count = 0;
    private List<TopicListener> listeners = new ArrayList<>();

    public void attach(TopicListener t) {
        listeners.add(t);
    }
    public void detach(TopicListener t) {
        listeners.remove(t);
    }

    public void addNew(String content) {
        count++;
        News n = new News(count, content);
        news.add(n);
        for (var l: listeners) {
            l.insertListen(n);
        }
    }
    public void update(News n) {

    }
}
