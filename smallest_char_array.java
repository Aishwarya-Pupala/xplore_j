
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class smallestChar  {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
      Scanner sc = new Scanner(System.in);
   String s1=sc.nextLine();
    char[] c = s1.toCharArray();
    for (int i = 0; i<c.length; i++) {
    	System.out.println(c[i]);
    	}
int[] ch=new int[s1.length()];
for(int i=0;i<s1.length(); i++) {
 ch[i]=(int)c[i];
}
//for (int i = 0; i<ch.length; i++) {
//System.out.println(ch[i]);
//}
 for (int i = 0; i<ch.length; i++) {
 for (int j = i + 1; j < ch.length;j++) {
	 if(ch[i] > ch[j]) {
          int T = ch[i]; 
         ch[i]=ch[j]; 
           ch[j]=T;}
          } }
//	System.out.println(ch[0]);
 for (int i = 0; i<c.length; i++) {
	int k=ch[0];                // ch -> no   c->char
	//char n='H';
	int l=(int)(c[i]);
//	System.out.println(k);
	//System.out.println(l);
	
	 if (l==k) {
	 System.out.println(c[i]);
	 }}
 
 
   }
}
