package creational.factory.shape_A3;

public abstract class Shape {
    String brush, paper, frame;

    public abstract String draw();

    protected Shape(){
        this.brush = "Default brush";
        this.paper = "Default paper";
        this.frame = "Default frame";
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }


    public String getBrush() {
        return brush;
    }

    public String getPaper() {
        return paper;
    }

    public String getFrame() {
        return frame;
    }
}
