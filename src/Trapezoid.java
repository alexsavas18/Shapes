// Trapezoid class, which inherits the Shape class
public class Trapezoid extends Shape
{
    // A trapezoid has a lower base, an upper base, and a height
    private double lowerBase;
    private double upperBase;
    private double height;

    // Trapezoid's constructor, which assigns the parameter values to the fields
    public Trapezoid(double b1, double b2, double h)
    {
        lowerBase = b1;
        upperBase = b2;
        height = h;
    }

    // Method to return the area of a Trapezoid
    public double getArea()
    {
        return 0.5 * (lowerBase + upperBase) * height;
    }

    // Modifying the toString() method to return the given String, which displays the area
    public String toString()
    {
        return String.format("I am a trapezoid shape of area " + "%.2f", getArea());
    }
}
