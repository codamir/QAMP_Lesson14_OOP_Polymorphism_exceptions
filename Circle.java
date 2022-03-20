package pack.homework;

public class Circle extends Shape{
    private double radius;
    static double piNumber = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        double circleArea = this.radius*this.radius*piNumber;
        if(circleArea<0){
            throw new NumberFormatException("Error. Result can not be negative number. Please check your inputs.");
        }
        return circleArea;
    }

    @Override
    public double perimeter(){
        double circlePerimeter = 2*this.radius*piNumber;
        if(circlePerimeter<0){
            throw new NumberFormatException("Error. Result can not be negative number. Please check your inputs.");
        }
        return circlePerimeter;
    }









}


