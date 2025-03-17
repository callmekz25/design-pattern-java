package creational.singleton.A4;

public class User {

    private String hoTen;
    public User(String hoTen) {
        this.hoTen = hoTen;
    }
    public void vote(Candidate c) {

        Election election = Election.getInstance();
        election.vote(c, hoTen);

    }

}
