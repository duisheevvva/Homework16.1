public class Circle extends Shapes{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void findArea() {
        System.out.println(Math.PI*(r*r));
    }
}
