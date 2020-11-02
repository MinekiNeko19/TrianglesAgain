public class Triangle {
    private Point v1, v2, v3;

    //constructors
    public Triangle(Point a, Point b, Point c) {
        v1 = a;
        v2 = b;
        v3 = c;
    }

    public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
        v1 = new Point(x1,y1);
        v2 = new Point(x2,y2);
        v3 = new Point(x3,y3);
    }

    //accessors (no rounding)
    public double getPerimeter() {
        return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
    }

    public double getArea() {
        double s1 = v1.distanceTo(v2);
        double s2 = v1.distanceTo(v3);
        double s3 = v2.distanceTo(v3);
        double s = (s1+s2+s3)/2;

        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)); // hmm
    }

    private static double roundTenThousandths(double n) {
        n = Math.round(n*10000);
        n = n/10000;
        return n;
    }

    public String classify() {
        double s1 = roundTenThousandths(v1.distanceTo(v2));
        double s2 = roundTenThousandths(v2.distanceTo(v3));
        double s3 = roundTenThousandths(v3.distanceTo(v1));
        if (s1==s2 && s2==s3) {
            return "equilateral";
        } else if (s1==s2 || s2 == s3 || s1==s3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public String toString() {
        String A = "v1(" + String.valueOf(v1.getX()) + ", " + String.valueOf(v1.getY()) + ") ";
        String B = "v2(" + String.valueOf(v2.getX()) + ", " + String.valueOf(v2.getY()) + ") ";
        String C = "v3(" + String.valueOf(v3.getX()) + ", " + String.valueOf(v3.getY()) + ")";
        return A+B+C;
    }

    public void setVertex(int index, Point newP) {
        if (index == 0) {
            v1 = newP;
        } else if (index == 1) {
            v2 = newP;
        } else {
            v3 = newP;
        }
    }
    
}
