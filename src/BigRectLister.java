import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 1));
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(6, 1));
        rectangles.add(new Rectangle(4, 2));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(2, 4));
        rectangles.add(new Rectangle(3, 2));

        BigRectangleFilter filter = new BigRectangleFilter();

        // Filter and display rectangles with a perimeter > 10
        System.out.println("Big Rectangles:");
        for (Rectangle r : rectangles) {
            if (filter.accept(r)) {
                System.out.println("Rectangle [width=" + r.width + ", height=" + r.height +
                        "] with perimeter: " + (2 * r.width + 2 * r.height));
            }
        }
    }
}
