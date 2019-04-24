/**
 *
 */
package AbstractFactoryPattern;

/**
 * @author demo
 *
 */
public abstract class AbstractFactory {
    public abstract Color getColorType(String color);
    public abstract Shape getShapeType(String shape);
}
