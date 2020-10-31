public class PointTester {
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(1,1);
        Point c = new Point(1,3);
        Point d = new Point(2,2);
        Point e = new Point(2,3);
        Point f = new Point(2,1);

        System.out.println(a.distanceTo(b));
        System.out.println(a.distanceTo(d));
        System.out.println(a.distanceTo(c));

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
