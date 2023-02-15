public class Main {
    public static void main(String[] args) {
      Shapes [] shapes={new Triangle(2,4),
                        new Rectangle(3,5),
                        new Circle(4),
                        new Square(6,6)};
        for (Shapes s:shapes) {
            s.findArea();
        }










    }
}