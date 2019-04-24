package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShapeType(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColorType(String color) {
        return null;
    }
}
