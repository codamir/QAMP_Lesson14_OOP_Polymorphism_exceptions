package pack.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double radius = 0;
        double sideOne = 0;
        double sideTwo = 0;
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;

        int answer = 0;
        char choice = 0;
        int calc = 0;

        ArrayList<Shape> shapes = new ArrayList<>();

        do {
            System.out.println("Choose shape:");
            String[] menuOptions = {
                    "Rectangle area and perimeter",
                    "Circle area and circumference",
                    "Triangle area and perimeter",
            };

            menuFromArray(menuOptions);

            answer = reader.nextInt();

            if (answer == 1) {
                calc = calculations();
                int count = 0;
                for (int i = 0; i < calc; i++) {
                    System.out.println("For your " + ++count + "." + " rectangle.");
                    System.out.println("Enter first side of rectangle:");
                    sideOne = reader.nextDouble();
                    System.out.println("Enter second side of rectangle:");
                    sideTwo = reader.nextDouble();
                    shapes.add(new Rectangular(sideOne, sideTwo));
                }
            } else if (answer == 2) {
                calc = calculations();
                int count = 0;
                for (int i = 0; i < calc; i++) {
                    System.out.println("For your " + ++count + "." + " circle, please enter radius:");
                    radius = reader.nextDouble();
                    shapes.add(new Circle(radius));
                }
            } else if (answer == 3) {
                calc = calculations();
                for (int i = 0; i < calc; i++) {
                    int count = 0;
                    System.out.println("For your " + ++count + "." + " triangle, please.");
                    System.out.println("Enter side A:");
                    sideA = reader.nextDouble();
                    System.out.println("Enter side B:");
                    sideB = reader.nextDouble();
                    System.out.println("Enter side C:");
                    sideC = reader.nextDouble();
                    shapes.add(new Triangle(sideA, sideB, sideC));
                }
            } else {
                System.out.println("Wrong number entered. Please choose option between 1 and 3. Try again? y/n");
                choice = reader.next().toLowerCase().charAt(0);
            }
            System.out.println("Do you want to calculate area and perimeter for another shape? y/n");
            choice = reader.next().toLowerCase().charAt(0);
        } while (choice == 'y');

        printResult(shapes);
    }

    static void printResult (ArrayList<Shape> shapes){
        int counter = 0;
        for (Shape result:shapes) {
            try {
                System.out.println("Your " + ++counter +"."+ " input - Area: " + result.area() + ", Perimeter: " + result.perimeter());
            } catch (Exception m){
                System.out.println(m.getMessage());
            }
        }
    }

    static void menuFromArray(String[] menu){
        int count = 0;
        for(int i = 0;i <menu.length; i++) {
            System.out.println(++count + ". " + menu[i]);
        }
    }

    static int calculations (){
        Scanner reader = new Scanner(System.in);
        int calc;
        char choice;

        do {
            System.out.println("How many calculations you would like?");
            calc = reader.nextInt();

            if (calc <= 0) {
                System.out.println("Number of calculations must be 1 or higher.");
                System.out.println("Try again? y/n");
                choice = reader.next().toLowerCase().charAt(0);
            } else break;
        } while (choice == 'y');
        return calc;
    }
}





