import java.awt.*;

public class BigRectangleFilter implements Filter{
    @Override
    public boolean accept(Object x) {
        Rectangle r = (Rectangle) x;
        double perimeter = 2 * r.getHeight() + 2 * r.getWidth();

        if(perimeter > 10)
            return true;
        else
            return false;
    }
}
