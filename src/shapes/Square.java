package shapes;

public class Square extends Rectangle {
    public int side;

    public Square(int side){
        this.side = side;
        this.length = side;
        this.width = side;
    }

    public int getPerimeter(){
        return 4*side;
    }

    public int getArea(){
        return side*side;
    }

    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle square2 = new Square(6);

        System.out.println(square.inheritedString);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square2.getArea());
        System.out.println(square2.getPerimeter());


    }
}
