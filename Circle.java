
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends GeometricalFigure 
{
    public void draw()
    {
        System.out.println("Circle");
    }
    
    public void sendCall()
    {
        System.out.println("Circle sendCall~~");
    }
    
    public void receiveCall()
    {
        System.out.println("Circle receiveCall~~");
    }
}
