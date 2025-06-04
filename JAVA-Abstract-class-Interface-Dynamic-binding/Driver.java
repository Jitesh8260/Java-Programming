public class Driver {
    public static void main(String[] args) {
        Triangle t1=new Triangle(12.0,6.0);
        System.out.println("Area of Triangle : "+t1.getArea());
        Rectangle r1=new Rectangle(20.0,30.0);
        System.out.println("Area of  Rectangle : "+r1.getArea());
    }
}
abstract class GeometricFigure{
    double dim1;
    double dim2;
    GeometricFigure(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract double getArea();
}
class Triangle extends GeometricFigure{
    Triangle(double height, double base){
        super(height,base);
    }
    double getArea(){
        return (dim1*dim2)/2;
    }
}
class Rectangle extends GeometricFigure{
    Rectangle(double length,double breadth){
        super(length,breadth);
    }
    double getArea(){
        return dim1*dim2;
    }
}
