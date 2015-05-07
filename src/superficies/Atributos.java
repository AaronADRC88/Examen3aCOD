package superficies;

/**
 *
 * @author aferreiradominguez
 */
public class Atributos {

    private String shapeType;
    private float squareArea, sideLength, sideHeight, rectangleArea, baseLength, height, triangleArea, radius, circleArea;

    static Atributos var = new Atributos();

    /**
     *Constructor vacio de la clase
     */
    public Atributos() {
    }

    /**
     * Constructor con parametros de la clase
     * @param shapeType --> String forma
     * @param squareArea --> float area del cuadrado
     * @param sideLength --> float tamañoLado
     * @param sideHeight --> float tamañoAncho
     * @param rectangleArea --> float area del rectangulo
     * @param baseLength --> float largo de la base
     * @param height -->    float ancho
     * @param triangleArea --> float area del triangulo
     * @param radius -->    float radio
     * @param circleArea --> float area del circulo
     */
    public Atributos(String shapeType, float squareArea, float sideLength, float sideHeight, float rectangleArea, float baseLength, float height, float triangleArea, float radius, float circleArea) {
        this.shapeType = shapeType;
        this.squareArea = squareArea;
        this.sideLength = sideLength;
        this.sideHeight = sideHeight;
        this.rectangleArea = rectangleArea;
        this.baseLength = baseLength;
        this.height = height;
        this.triangleArea = triangleArea;
        this.radius = radius;
        this.circleArea = circleArea;
    }

    /**
     *
     * @return forma elegida
     */
    public String getShapeType() {
        return shapeType;
    }

    /**
     * 
     * @param shapeType recibe la forma para cambiarla
     */
    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    /**
     *
     * @return areaCuadrado
     */
    public float getSquareArea() {
        return squareArea;
    }

    /**
     *
     * @param squareArea recibe areaCuadrado para cambiarla
     */
    public void setSquareArea(float squareArea) {
        this.squareArea = squareArea;
    }

    /**
     *
     * @return lado
     */
    public float getSideLength() {
        return sideLength;
    }

    /**
     *
     * @param sideLength recibe lado para cambiarlo
     */
    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    /**
     *
     * @return ancho
     */
    public float getSideHeight() {
        return sideHeight;
    }

    /**
     *
     * @param sideHeight recibe ancho para cambiarlo
     */
    public void setSideHeight(float sideHeight) {
        this.sideHeight = sideHeight;
    }

    /**
     *
     * @return areaRectangulo
     */
    public float getRectangleArea() {
        return rectangleArea;
    }

    /**
     *
     * @param rectangleArea recibe areaRectangulo par cambiarla
     */
    public void setRectangleArea(float rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

    /**
     *
     * @return base
     */
    public float getBaseLength() {
        return baseLength;
    }

    /**
     *
     * @param baseLength recibe base y la cambia
     */
    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    /**
     *
     * @return ancho
     */
    public float getHeight() {
        return height;
    }

    /**
     *
     * @param height recibe ancho para cambiarlo
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     *
     * @return areaTriangulo
     */
    public float getTriangleArea() {
        return triangleArea;
    }

    /**
     *
     * @param triangleArea recibe area Triangulo para cambiarla
     */
    public void setTriangleArea(float triangleArea) {
        this.triangleArea = triangleArea;
    }

    /**
     *
     * @return radio
     */
    public float getRadius() {
        return radius;
    }

    /**
     *
     * @param radius recibe radio para cambiarlo
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     *
     * @return area del circulo
     */
    public float getCircleArea() {
        return circleArea;
    }

    /**
     *
     * @param circleArea recibe area del circulo parqa cambiarlo
     */
    public void setCircleArea(float circleArea) {
        this.circleArea = circleArea;
    }

    @Override
    public String toString() {
        return "Atributos{" + "shapeType=" + shapeType + ", squareArea=" + squareArea + ", sideLength=" + sideLength + ", sideHeight=" + sideHeight + ", rectangleArea=" + rectangleArea + ", baseLength=" + baseLength + ", height=" + height + ", triangleArea=" + triangleArea + ", radius=" + radius + ", circleArea=" + circleArea + '}';
    }

}
