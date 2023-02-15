public class Rectangle extends Shapes{
    private int c;
    private int d;

    public Rectangle(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public void findArea() {
        System.out.println((c+d)*2);
    }
}
