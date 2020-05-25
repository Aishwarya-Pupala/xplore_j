import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Distance {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
         Scanner sc=new Scanner(System.in);
         int x1=sc.nextInt();
         int y1=sc.nextInt();
         int x2=sc.nextInt();
         int y2=sc.nextInt();

         Point p1=new Point(x1,y1,x2,y2);
         
        double d= findDistance(p1);
        System.out.println(String.format("%.3f",d));
         
    }
    
    public static double findDistance(Point p1)
    {
        double dist;
        double diff=Math.pow(p1.getX2()-p1.getX1(),2)+Math.pow(p1.getY2()-p1.getY1(),2);
        dist=Math.sqrt(diff);
        return dist;
        }
    
}

class Point
{
   int x1,y1,x2,y2;

public Point(int x1, int y1, int x2, int y2) {
    //super();
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
}

public int getX1() {
    return x1;
}

public void setX1(int x1) {
    this.x1 = x1;
}

public int getY1() {
    return y1;
}

public void setY1(int y1) {
    this.y1 = y1;
}

public int getX2() {
    return x2;
}

public void setX2(int x2) {
    this.x2 = x2;
}

public int getY2() {
    return y2;
}

public void setY2(int y2) {
    this.y2 = y2;
} 
   
}
