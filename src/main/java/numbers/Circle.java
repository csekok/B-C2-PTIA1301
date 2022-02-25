package numbers;

public class Circle {
    /**
     * Task 2: Create Circle class in numbers package.
     * When we create a new Circle object we should give its radius.
     * Create new methods:
     *   - getRadius: return the radius of circle.
     *   - getArea: return the area of circle.
     *   - getPerimeter: return the perimeter of circle.
     * Hint: Create a quasi-constant PI value in Circle class. (Or you can import Math.PI.)
     */
    private final double radius;
    public static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * PI;
    }
}
