package creational.singleton.example;

public class MySingleton {
    private static MySingleton instance;
    int count = 0;
    private MySingleton(){

    };
    public static MySingleton getInstance(){
        if(instance == null) {
            instance = new MySingleton();
        }
        return instance;
    };

    public void display(){
        System.out.println(count++);
    }
}
