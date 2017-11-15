package corejava.inheritance;

/**
 * Created by Gowtham on 31-10-2017.
 */
public class Rectangle implements Relatable {

    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private int getArea() {
        return this.width * this.height;
    }

    @Override
    public void hello() {
        System.out.println("Hello Gowtham!");
    }

    @Override
    public int isLargerThan(Relatable other) {
        Rectangle rectangle = (Rectangle) other;

        if (this.getArea() < rectangle.getArea())
            return -1;
        else if (this.getArea() > rectangle.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}
