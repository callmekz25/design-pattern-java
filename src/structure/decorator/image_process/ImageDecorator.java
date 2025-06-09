package structure.decorator.image_process;

public class ImageDecorator extends Image{
    Image image;

    public ImageDecorator(Image image) {
        this.image = image;
    }


    @Override
    public void process() {

    }
}
