package pack.homework;

public class Rectangular extends Shape{
    private double sideA;
    private double sideB;

    public Rectangular(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        double rectangleArea = this.sideA*this.sideB;
        if(rectangleArea<0){
            throw new NumberFormatException("Error. Result can not be negative number. Please check your inputs.");
        }
        return rectangleArea;

    }

    @Override
    public double perimeter() {
        double rectanglePerimeter = 2*(this.sideA+this.sideB);
        if(rectanglePerimeter<0){
            throw new NumberFormatException("Error. Result can not be negative number. Please check your inputs.");
        }
        return rectanglePerimeter;
    }
}

