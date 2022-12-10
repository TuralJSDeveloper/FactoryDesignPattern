
public class FactoryMain {

    public static void main(String[] args) {
        FactoryShape fs = new FactoryShape();
        Shape s = fs.createShape("Circle");
        s.draw();

    }
}
