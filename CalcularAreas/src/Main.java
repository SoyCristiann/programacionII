//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Triangle triangle1= new Triangle(5,10);
        Rectangle rectangle1= new Rectangle(10,10);
        Circle circle1= new Circle(20);


        IShape[] shapes= {triangle1, circle1, rectangle1};

        for (IShape shape : shapes) {
            System.out.println("▶️ The "+shape.getName()+"'s area is: " + shape.getArea());
        }

        double totalAreas = areaCalculator.sum(shapes);
        System.out.println("🧮 The total areas of all shapes is: " + totalAreas);


    }
}