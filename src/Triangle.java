public class Triangle extends Shapes{
    private int a;
    private int h;

    public Triangle(int a, int b) {
        this.a = a;
        this.h = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void findArea() {
        System.out.println((a+ h)/a);
    }
}
