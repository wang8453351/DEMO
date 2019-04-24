/**
 *
 */
package AbstractFactoryPattern;

/**
 * @author demo
 *
 */
public class ColorFactory extends AbstractFactory {

    /* (non-Javadoc)
     * @see AbstractFactoryPattern.AbstractFactory#getColorType(java.lang.String)
     */
    @Override
    public Color getColorType(String color) {
        // TODO Auto-generated method stub
        if(color == null) {
            return null;
        }
        if(color.equalsIgnoreCase("RED")) {
            return new Red();
        }else if(color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }else if(color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }

    /* (non-Javadoc)
     * @see AbstractFactoryPattern.AbstractFactory#getShapeType(java.lang.String)
     */
    @Override
    public Shape getShapeType(String shape) {
        // TODO Auto-generated method stub
        return null;
    }

}
