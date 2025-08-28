public class Circle {
    private final double radius;
    public Circle(double radius) {

        this.radius = radius;
    }
    public double getRadius() { return radius; }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
