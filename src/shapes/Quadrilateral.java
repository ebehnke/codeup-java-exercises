package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public abstract double getLength();
    public abstract double getWidth();

    public abstract void setLength(double l);
    public abstract void setWidth(double w);

    public Quadrilateral(double l, double w) {
        this.length = l;
        this.width = w;
    }


}
