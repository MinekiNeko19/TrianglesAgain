public class PointTester {
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(1,1);
        Point c = new Point(1,3);
        Point d = new Point(2,2);
        Point e = new Point(2,3);
        Point f = new Point(2,1);

        Triangle scalene = new Triangle(a,f,c);
        Triangle isosceles = new Triangle(0,0,3,0,0,3);
        Triangle equilateral = new Triangle(0.1,0.1,-1.9,0.1,-0.9,-1.632051);

        // System.out.println(a.distanceTo(b));
        // System.out.println(a.distanceTo(d));
        // System.out.println(a.distanceTo(c));

        // System.out.println(a.equals(b));
        // System.out.println(a.equals(c));

        // System.out.println(scalene.getPerimeter());
        // System.out.println(isosceles.getPerimeter());

        // System.out.println(scalene.getArea());
        // System.out.println(isosceles.getArea());

        ////Testing rounding fxn
        //     System.out.println(roundTenThousandths(123.55555555555555));
        // }
        // public static double roundTenThousandths(double n) {
        //         n = Math.round(n*10000);
        //         n = n/10000;
        //         return n;

        System.out.println(scalene.classify());
        System.out.println(isosceles.classify());
        System.out.println(equilateral.classify());
        }
}
