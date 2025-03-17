package creational.singleton.example;

public class Main {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.display();
        s2.display();
    }
}
