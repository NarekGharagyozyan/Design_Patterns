package Factory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory.getShape(ShapeType.CIRCLE).draw();
        ShapeFactory.getShape(ShapeType.RECTANGLE).draw();

    }
}
