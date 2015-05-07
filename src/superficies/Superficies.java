package superficies;

/**
 *
 * @author aferreiradominguez
 */
public class Superficies {

    /**
     *
     * @return area deseada
     */
    public static float metodos() {
        if (Atributos.var.getShapeType().equals("square")) {
            //add area calculations for square
            Atributos.var.setSquareArea(Atributos.var.getSideLength() * Atributos.var.getSideLength());
            return Atributos.var.getSquareArea();
        }
        if (Atributos.var.getShapeType().equals("rectangle")) {
            //add area calculations for rectangle here

            Atributos.var.setRectangleArea(Atributos.var.getSideLength() * Atributos.var.getSideHeight());
            return Atributos.var.getRectangleArea();
        }
        if (Atributos.var.getShapeType().equals("triangle")) {
            //add area calculations for triangle here

            Atributos.var.setTriangleArea((float) (0.5 * Atributos.var.getBaseLength() * Atributos.var.getHeight()));
            return Atributos.var.getTriangleArea();
        }
        if (Atributos.var.getShapeType().equals("circle")) {
            //add area calculations for a circle here
            Atributos.var.setCircleArea(Atributos.var.getRadius() * Atributos.var.getRadius());
            Atributos.var.setCircleArea((float) (3.14159265 * Atributos.var.getCircleArea()));
            return Atributos.var.getCircleArea();
        } else {
            return 0;
        }
    }

    /**
     *
     * @param args "Main"
     */
    public static void main(String[] args) {
        Impresion.insertKind();
        Superficies.metodos();
        if (Atributos.var.getShapeType().equals("square")) {
            Impresion.squareArea();
        }
        if (Atributos.var.getShapeType().equals("rectangle")) {
            Impresion.rectangleArea();
        }
        if (Atributos.var.getShapeType().equals("triangle")) {
            Impresion.triangleArea();
        }
        if (Atributos.var.getShapeType().equals("circle")) {
            Impresion.circleArea();
        }

    }
}
