
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends GeometricalFigure 
{
    public void draw()
    {
        System.out.println("Triangle");
    }
    
    public void sendCall()
    {
        System.out.println("Triangle sendCall~~");
    }
    public void receiveCall()
    {
        System.out.println("Triangle receiveCall~~");
    }
}
