package behavioral.observer.Topic;

import java.util.ArrayList;
import java.util.List;

public class MemberB extends  Member{
    private List<News> news = new ArrayList<>();

    public MemberB(Topic topic) {
        super(topic);
    }

    @Override
    public void updateListen(News n) {

    }

    @Override
    public void insertListen(News n) {
        news.add(n);
        System.out.println(news);
    }
}
