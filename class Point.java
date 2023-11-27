public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int GetX() {
        return x;
    }

    public int GetY() {
        return y;
    }

    public void SetX(int new_x) {
        this.x = new_x;
    }

    public void SetY(int new_y) {
        this.y = new_y;
    }

    public double Distance(Point p) {
        int dx = x - p.GetX();
        int dy = y - p.GetY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double norme() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        System.out.println(p2.Distance(p1));
        System.out.println(p2.norme());
    }
}