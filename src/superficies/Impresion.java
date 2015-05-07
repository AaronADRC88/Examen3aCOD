package superficies;

import java.util.Scanner;

/**
 *
 * @author aferreiradominguez
 */
public class Impresion {

    private static Scanner sc;

    /**
     *Metodo que recibe e imprime el tipo de area deseada
     */
    public static void insertKind() {
        sc = new Scanner(System.in);
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        Atributos.var.setShapeType(sc.nextLine());
        System.out.println("You said: " + Atributos.var.getShapeType());

    }

    /**
     *Metodo que recibe el lado del cuadrado e imprime el area
     */
    public static void squareArea() {
        System.out.println("what is the side length?");
        Atributos.var.setSideLength(sc.nextFloat());
        System.out.println("The area for your square: " + Superficies.metodos());
    }

    /**
     *Metodo que recibe la base y altura del rectangulo e imprime el area
     */
    public static void rectangleArea() {
        System.out.println("what is the rectangles width?");
        Atributos.var.setSideLength(sc.nextFloat());
        System.out.println("What is the rectangles height?");
        Atributos.var.setSideHeight(sc.nextFloat());
        System.out.println("The area for your rectangle is: " + Superficies.metodos());
    }

    /**
     *Metodo que recibe la base y altura del triangulo e imprime el area
     */
    public static void triangleArea() {
        System.out.println("What is the base length of the triangle?");
        Atributos.var.setBaseLength(sc.nextFloat());
        System.out.println("What is the height of the triangle?");
        Atributos.var.setHeight(sc.nextFloat());
        System.out.println("Your triangles area is: " + Superficies.metodos());
    }

    /**
     *Metodo que recibe el radio e imprime el area
     */
    public static void circleArea() {
        System.out.println("What is the radius of the circle?");
        Atributos.var.setRadius(sc.nextFloat());
        System.out.println("Your Circles area is " + Superficies.metodos());
    }
}
