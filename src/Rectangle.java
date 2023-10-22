// Rectangle class, which inherits the Shape class
public class Rectangle extends Shape
{
    // A rectangle has a length and a width
    private double length;
    private double width;

    // Rectangle's constructor, which assigns the parameter values to the fields
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }

    // Method to return the area of a Rectangle
    public double getArea()
    {
        return length * width;
    }

    // Modifying the toString() method to return the given String, which displays the area
    public String toString()
    {
        return String.format("I am a rectangle shape of area " + "%.2f", getArea());
    }
}
