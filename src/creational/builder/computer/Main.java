package creational.builder.computer;

public class Main {
    public static void main(String[] args) {
        Computer.Builder a = new Computer.Builder();
        a.buildCpu("Intel 14");
        a.buildRam("8");
        a.buildStorage("512");
        a.buildScreen("15.6inch");
        System.out.println(a.build().toString());
    }


}
