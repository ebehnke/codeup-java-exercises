package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public abstract double setLength(double l);
    public abstract double setWidth(double w);

    public Quadrilateral(double l, double w) {
        this.length = l;
        this.width = w;
    }


}
