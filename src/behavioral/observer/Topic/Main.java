package behavioral.observer.Topic;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        MemberA memberA = new MemberA(topic);
        MemberB memberB = new MemberB(topic);

        topic.addNew("123");
        topic.addNew("456");



    }
}
