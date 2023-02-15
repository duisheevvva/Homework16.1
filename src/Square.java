public class Square extends Shapes{
    private int f;
    private int s;

    public Square(int f, int s) {
        this.f = f;
        this.s = s;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public void findArea() {
        System.out.println((f+s)*2);
    }
}
