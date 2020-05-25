import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        long[] arr=new long[5];

        long[] a=new long[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){

          int  n=sc.nextInt();
            if(n>0){
            arr[i]=n;}
        }
    long fact=1;
     for(int i=0;i<arr.length;i++){
          for(int j=1;j<=arr[i];j++){
              fact=fact*j;
          }
          a[i]=fact;
          fact=1;
    }
    
 for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }  
}}


#inputs   output-- 1 2
1
hello world
aaa writer
50
2
World cup
bbb writer
55
3
Planet earth
ccc writer
45
4
India's history
ddd writer
40
WORLD






