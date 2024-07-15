package Task4;

class Circle{
    public int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius*this.radius*Math.PI;
    }

    public double getCircumference(){
        return 2*this.radius*Math.PI;
    }
}
public class CircleEx {
    public static void main(String[]args){

        Circle bangle = new Circle(10);
        System.out.println("Bangle Area: "+bangle.getRadius()+", Circumference: "+bangle.getCircumference());
    }
}
