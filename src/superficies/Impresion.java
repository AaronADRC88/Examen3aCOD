package superficies;

import java.util.Scanner;

public class Impresion {

    static Atributos var = new Atributos();
    private static Scanner sc;

    public void insertKind() {
        sc = new Scanner(System.in);
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        var.setShapeType(sc.nextLine());
        System.out.println("You said: " + var.getShapeType());
    }

    public void squareArea() {
        System.out.println("what is the side length?");
        var.setSideLength(sc.nextFloat());
        //squareArea = sideLength * sideLength;
        System.out.println("The area for your square: " + var.getSquareArea());
    }

    public void rectangleArea() {
        System.out.println("what is the rectangles width?");
        var.setSideLength(sc.nextFloat());
        System.out.println("What is the rectangles height?");
        var.setSideHeight(sc.nextFloat());
        //rectangleArea = sideLength * sideHeight;
        System.out.println("The area for your rectangle is: " + var.getRectangleArea());
    }

    public void triangleArea() {
        System.out.println("What is the base length of the triangle?");
        var.setBaseLength(sc.nextFloat());
        System.out.println("What is the height of the triangle?");
        var.setHeight(sc.nextFloat());
        //triangleArea = (float) (0.5 * baseLength * height);
        System.out.println("Your triangles area is: " + var.getTriangleArea());
    }

    public void circleArea() {
        System.out.println("What is the radius of the circle?");
        var.setRadius(sc.nextFloat());
            //circleArea = radius * radius;
        //circleArea = (float) (3.14159265 * circleArea);
        System.out.println("Your Circles area is " + var.getCircleArea());
    }
}
