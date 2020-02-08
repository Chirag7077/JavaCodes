/*
 Compare 2D points for distance from origin
Write a program to check distance of 2D points from origin and print the point with highest distance. 

Create class Point with attributes as below:
double x
double y

In Solution class, define main method to read values for three point objects. 

Next, create below method in Solution class which will take three point objects
as input parameters and return the point with highest distance from origin. 

public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3)

Consider sample input as below to read values for six point objects
2
2
3
3
-4
-4

Output:
-4.0
-4.0
*/

import java.util.*;

public class TCSXploreQ3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        
        Point val = pointWithHighestOriginDistance(p1, p2, p3);
        System.out.format("%.1f\n", val.x);
        System.out.format("%.1f", val.y);
    }

    public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3){
        double dist1 = Math.sqrt(p1.x*p1.x + p1.y*p1.y);
        double dist2 = Math.sqrt(p2.x*p2.x + p2.y*p2.y);
        double dist3 = Math.sqrt(p3.x*p3.x + p3.y*p3.y);
        return dist1>dist2?(dist1>dist3?p1:p3):(dist2>dist3?p2:p3);
    }
}
class Point{
    double x;
    double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}