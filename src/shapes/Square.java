package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double l) {
        this.length = l;
        this.width = l;
    }

    public void setWidth(double w) {
        this.width = w;
        this.length = w;
    }


//    public static void main(String[] args) {
//        Square square = new Square(5);
//        System.out.println(square.getPerimeter());
//        System.out.println(square.getArea());
//
//    }





}

////    public int side;
//
//    public Square(int side) {
//        super(side,side);
//    }
//
////    public Square(int side){
////        this.side = side;
////        this.length = side;
////        this.width = side;
////    }
//
//    public int getPerimeter(){
//        return 4*this.length;
//    }
//
//    public int getArea(){
//        return this.length*this.length;
//    }
//
//    public static void main(String[] args) {
//        Square square = new Square(5);
//        Rectangle square2 = new Square(6);
////        Square square3 = new Rectangle(5,6)
//
//        System.out.println(square.inheritedString);
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//        System.out.println(square2.getArea());
//        System.out.println(square2.getPerimeter());
//
//
//    }

