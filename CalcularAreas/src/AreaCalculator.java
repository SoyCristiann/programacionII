import java.awt.*;

public class AreaCalculator {

    public double sum(IShape[] shapes) {
        double totalArea = 0;
        for (IShape shape : shapes) {
            /*
            * Con la refactorización, si se necesitan agregar figuras, solo deben crearse en su propia clase, implementar la interfaz IShape y definir su propio metodo getArea.
            * */
            totalArea += shape.getArea();

            /*
            **Este bloque de condiciones obligaba a que si se agregaban nuevas figuras, se debía modificar la clase para agregar nuevas condiciones y así calcular el área de figuras específicas.
            *
            if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle) shape;
                totalArea += rect.getWidth() * rect.getHeight();
            }
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                totalArea += Math.PI * circle.getRadius() * circle.getRadius();
            }*/
        }
        return totalArea;
    }
}