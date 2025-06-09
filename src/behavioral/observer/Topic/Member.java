package behavioral.observer.Topic;

public abstract class Member implements TopicListener{
     Topic topic;

    public Member(Topic topic) {
        this.topic = topic;
        topic.attach(this);
    }


}
