package shapes;

public class Circle {
    private double radius;
    private double pi = 3.141592;
    private double area;
    private double circumference;


    public Circle(double rad) {
        this.radius = rad;
    }

    public double getArea() {
        return this.area = pi*(radius*radius);
    }

    public double getCircumference() {
        return this.circumference = 2*pi*this.radius;
    }

//    public static void main(String[] args) {
//        Circle c1 = new Circle(10);
//
//        System.out.println(c1.radius);
//        c1.getArea();
//        System.out.println(c1.area);
//        c1.getCircumference();
//        System.out.println(c1.circumference);
//
//    }
}
