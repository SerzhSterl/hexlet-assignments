package exercise;

// BEGIN
public class Circle {

    private Point point;
    private static int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public static Double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("");
        }
        return radius * radius * Math.PI;
    }
}
// END
