import java.sql.SQLOutput;
import java.util.*;
import java.math.*;

// here we have 3 task
// 1st to calculate the distance
// 2nd to get maximum and then
// 3rd to compare whether max == sum of other two
// and then tell whether it is a triplet or not
class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class PythagorianTriplet {

    public static int calDistanceSquared(Point p, Point q){
        int dx = p.x-q.x;
        int dy = p.y-q.y;
        return dx*dx + dy*dy;
    }
    public static boolean isPythagoreanTriplet(int d1, int d2, int d3){
        // search the maximum out of them
        int max = Math.max(d1,Math.max(d2,d3));
        int sumOfOtherTwo = d1 +d2+ d3 - max;
        return max == sumOfOtherTwo;
    }
    public static void main(String[] args) {
        //lets take some points for ex
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);

        int d1 = calDistanceSquared(p1,p2);
        int d2 = calDistanceSquared(p3,p2);
        int d3 = calDistanceSquared(p1,p3);

        System.out.println(isPythagoreanTriplet(d1,d2,d3));


    }
}
