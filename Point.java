public class Point {
    private double x,y;

        //construct a point given coordinates
    public Point(double X, double Y){
        x=X;
        y=Y;
    }

    //construct a point given a point  (redundant , just provides flexibility)
    public Point(Point p){
        x= p.x;  //private access in the same file is allowed!
        y= p.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distanceTo(Point other) {
        double xleg = this.getX()-other.getX();
        double yleg = this.getY()-other.getY();
        return Math.sqrt((xleg*xleg)+(yleg*yleg));
        // double x = this.getX()-other.getX();
        // double y = this.getY()-other.getY();
        // return Math.sqrt((x*x)+(y*y));
    }

    public boolean equals(Point other) {
        return (this.getX()==other.getX()) && (this.getY()==other.getY());
    }
}