public class Triangle implements IShape{

    private final double BASE;
    private final double HEIGHT;

    public Triangle(double base, double height){
        this.BASE= base;
        this.HEIGHT= height;
    }

    @Override
    public double getArea() {
        return (BASE*HEIGHT)/2;
    }

    @Override
    public String getName(){
        return "Triangle";
    }
}
