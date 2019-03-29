package shapes;

public class ShapesTest {

    public static void main(String[] args) {
    Rectangle myShape1;
    Measurable myShape2;
    Circle myshape3;
        myShape1 = new Rectangle(4,5);
        myShape2 = new Square(5);
        myshape3 = new Circle(3);


        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape1.getLength());
        System.out.println(myShape1.getWidth());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
        System.out.println(((Square) myShape2).getLength());
        System.out.println(((Square) myShape2).getWidth());

        myShape1.setLength(10);
        System.out.println(myShape1.length);

        System.out.println(myshape3.getCircumference());
        System.out.println(myshape3.getPerimeter());


    }

    //Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
        // When using implement you must use all of the methods/instantiations of the implemented class
    //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        // casts (Rectangle) or (Square) depending on myShape's declaration.


}
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
