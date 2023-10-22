// Main program that tests the functions in each class and creates instances
public class Canvas
{
    public static void main(String[] args) {

        // Create an array of type Shape with three items
        // This is the MVP, future releases will allow the user to choose the parameters for each shape
        Shape[] canvas = {

                new Parallelogram(7, 5),

                new Rectangle(5, 7),

                new Trapezoid(9, 7, 5)

        };

        // Scan the array and print out each item
        for (int i = 0; i < canvas.length; i++) {

                System.out.println(canvas[i]);
        }

    }
}
