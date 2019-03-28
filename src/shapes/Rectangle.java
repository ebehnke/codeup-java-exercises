package shapes;

public class Rectangle {
    int length;
    int width;
    public String inheritedString;

    public Rectangle() {
        this.inheritedString = "this.inheritedString from Rectangle() constructor";
    }

    public Rectangle(String str){
        this.inheritedString = str;
    }

    public void inheritedMethod() {
        System.out.printf("Hello from %s", this.inheritedString);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
        return 2*length + 2*width;
    }

    public int getArea() {
        return length*width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Parent");
        rectangle.inheritedString = "rectangle.inheritedString from main";

        rectangle.length = 5;
        rectangle.width = 5;
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
