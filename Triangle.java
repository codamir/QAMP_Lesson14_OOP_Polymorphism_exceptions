package pack.homework;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle (double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area(){
        double s = perimeter()/2;
        if(perimeter()<0){
            throw new NumberFormatException("Area cannot be negative number.");
        }
        exceptionTriangleSide();
        return Math.sqrt(s*(s- this.sideA)*(s- this.sideB)*(s- this.sideC));
    }

    @Override
    public double perimeter(){
        double perimeter = this.sideA+this.sideB+this.sideC;
        if(perimeter<0){
            throw new NumberFormatException("Error. Result can not be negative number. Please check your inputs.");
        }
        exceptionTriangleSide();
        return perimeter;
    }

    //I have also included this exception :)
    private void exceptionTriangleSide(){
        if(this.sideA>=this.sideB+this.sideC || this.sideB>=this.sideA+this.sideC || this.sideC>=this.sideA+this.sideB){
            throw new NumberFormatException("Error. One side of triangle cannot be greater than two other sides comibined.");
        }
    }
}
