package superficies;

public class Superficies {

    public void metodos() {
        if (Atributos.var.getShapeType().equals("square")) {
            //add area calculations for square
            Atributos.var.setSquareArea(Atributos.var.getSideLength() * Atributos.var.getSideLength());

        }
        if (Atributos.var.getShapeType().equals("rectangle")) {
            //add area calculations for rectangle here
            
            Atributos.var.setRectangleArea(Atributos.var.getSideLength() * Atributos.var.getSideHeight());
            

        }
        if (Atributos.var.getShapeType().equals("triangle")) {
            //add area calculations for triangle here
            
            Atributos.var.setTriangleArea((float) (0.5 * Atributos.var.getBaseLength() * Atributos.var.getHeight()));
            

        }
        if (Atributos.var.getShapeType().equals("circle")) {
            //add area calculations for a circle here
            Atributos.var.setCircleArea(Atributos.var.getRadius() * Atributos.var.getRadius());
            Atributos.var.setCircleArea((float) (3.14159265 * Atributos.var.getCircleArea())) ;
            

        }
    }

    public static void main(String[] args) {

    }
}
