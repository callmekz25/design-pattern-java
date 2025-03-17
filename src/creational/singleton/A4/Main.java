package creational.singleton.A4;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Kz");
        User user2 = new User("Mp");

        user1.vote(Candidate.TRUMP);
        user1.vote(Candidate.TRUMP);
        user2.vote(Candidate.TRUMP);
        user2.vote(Candidate.BIDEN);
        Election election = Election.getInstance();
        election.display();

    }
}
