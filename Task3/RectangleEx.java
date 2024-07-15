package Task3;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getArea() {
        return this.length * this.breadth;
    }

    public double getPerimeter() {
        return (this.length + this.breadth) * 2;
    }

}
public class RectangleEx {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(10, 20);
        System.out.println("Area: "+box.getArea()+", Perimeter: "+box.getPerimeter());
    }

}
