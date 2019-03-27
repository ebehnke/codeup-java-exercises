package shapes;

import util.Input;

public class CircleApp {


    public static void main(String[] args) {

        System.out.println("Enter a radius");
        Input test = new Input();
        Circle firstCircle = new Circle(test.getInt());
        double radius = test.getDouble();
        Circle c = new Circle(radius);

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());

        System.out.println(firstCircle.getArea());
        System.out.println(firstCircle.getCircumference());


    }

}
