package structure.decorator.image_process;

public class BasicProcess extends Image{
    String path;
    @Override
    public void process() {
        System.out.println(path);
    }
}
