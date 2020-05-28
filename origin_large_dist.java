import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.*;
public class origin_dist {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc=new Scanner(System.in);
        
        
        double x1=sc.nextInt();
        double y1=sc.nextInt();
        
        double x2=sc.nextInt();
        double y2=sc.nextInt();
        
        double x3=sc.nextInt();
        double y3=sc.nextInt();
        
        Pointss p1=new Pointss(x1,y1);
        Pointss p2=new Pointss(x2,y2);
        Pointss p3=new Pointss(x3,y3);
        
        Pointss pp=pointWithHighestOriginDistance(p1,p2,p3);
        
    System.out.print(pp.x+"\n"+pp.y);

    }
    
    public static Pointss pointWithHighestOriginDistance(Pointss p1,Pointss p2,Pointss p3) {
    
        Pointss max;
    double    a=Math.sqrt(Math.pow((p1.x-0), 2)+Math.pow((p1.y-0), 2));
    double    b=Math.sqrt(Math.pow((p2.x-0), 2)+Math.pow((p2.y-0), 2));
    double    c=Math.sqrt(Math.pow((p3.x-0), 2)+Math.pow((p3.y-0), 2));
    
    if (a>b && a>c) {
        max=p1;}
    else if (b>a && b>c) {
        max=p2;
    }
    //else if (c>a && c>b)
    //{
    //    max=p3;
    //}
    
    else {
        max=p3;
    }

    
    return max;
    }
    
    
}


class Pointss{    
    
    double x,y;

    public Pointss(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    
    
    
}
