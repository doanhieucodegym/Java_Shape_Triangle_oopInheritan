public class Triangle_Inheritance_Shape extends Shape {
    private double side1 ,side2,side3;

    public Triangle_Inheritance_Shape() {
    }

    public Triangle_Inheritance_Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle_Inheritance_Shape(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){

        double perimeter = getSide1() +getSide2() +getSide3();
        return perimeter;
    }
    public double getArea(){
     double  p=  getPerimeter()/2;
         double area = Math.sqrt( p*(p-getSide1()*p-getSide2()*(p-getSide3())));
       return area;
    }
    public String toString(){
        return "Side 1 = " +getSide1()
                +"Side 2 = " +getSide2()
                +"side 3 = " +getSide3()
                +" Area = "+ getArea()
                +" Perimeter =" +getPerimeter()
                +super.toString();
    }
}
