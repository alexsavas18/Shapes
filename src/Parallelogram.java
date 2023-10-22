// Parallelogram class, which inherits the Shape class
public class Parallelogram extends Shape
{
    // A parallelogram has a base and a height
    private double base;
    private double height;

    // Parallelogram's constructor, which assigns the parameter values to the fields
    public Parallelogram(double b, double h)
    {
        base = b;
        height = h;
    }

    // Method to return the area of a Parallelogram
    public double getArea()
    {
        return base * height;
    }

    // Modifying the toString() method to return the given String, which displays the area
    public String toString()
    {
        return String.format("I am a parallelogram shape of area " + "%.2f", getArea());
    }
}
