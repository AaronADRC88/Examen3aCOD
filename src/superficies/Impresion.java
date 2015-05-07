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
    public void squareArea(){
        System.out.println("what is the side length?");
            var.setSideLength(sc.nextFloat()); 
            //squareArea = sideLength * sideLength;
            System.out.println("The area for your square: " + var.getSquareArea());
    }
    
}
