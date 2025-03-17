package creational.singleton.A4;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private  int countBiden;
    private  int countTrump;
    List<String> usersID;
    protected Election(){
        countBiden = 0;
        countTrump = 0;
        usersID = new ArrayList<>();
    };


    public static Election getInstance() {
        if(instance == null) {
            instance = new Election();

        }
        return instance;
    }

    void vote(Candidate c, String userID) {
        if(usersID.contains(userID)) {
            return;
        } else {
            usersID.add(userID);
            if(c.equals(Candidate.TRUMP)) {
                countTrump++;
            } else {
                countBiden++;
            }
        }
    }
    public void display() {
        System.out.println("Trump: " + countTrump);
        System.out.println("Biden: " + countBiden);
    }
}
