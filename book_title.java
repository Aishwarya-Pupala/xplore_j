package java22;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bb {
    public static void main(String args[] ) throws Exception {
     Book[] b=new Book[4]; 
           
           int id;
           String title;
           String author;
           double price;
           Scanner sc=new Scanner(System.in);

           
           for(int i=0;i<b.length;i++) {
               id=sc.nextInt();sc.nextLine();
               title=sc.nextLine();
               author=sc.nextLine();
               price=sc.nextDouble();sc.nextLine();
               b[i]=new Book(id,title,author,price);
               
           }  
        String s=sc.nextLine();
   
        Book[] b2=searchTitle(b,s);
        display(b2);
                
    }
public static void display(Book[] b2) {
	 for(Book bk: b2)
     {
         System.out.println(bk.getId());
     }  }


      public static Book[] searchTitle(Book[] b,String s) { 
    	 int count=0;
    	 
    	 
        for(Book bb:b) {
			if(bb.getTitle().toLowerCase().contains(s.toLowerCase())) {
				 count++;
			}
		 
		}
     
        System.out.println("c==="+count);	 
        
		Book[] bb2=new Book[count];
	
		count=0;
		for(Book bb:b) {
			if(bb.getTitle().contains(s.toLowerCase())) {
			bb2[count++]=bb;
			}	}
		
          for (int i = 0; i< bb2.length; i++) { 
              for (int j = i + 1; j < bb2.length; j++) {
          
          if(bb2[i].getId() >bb2[j].getId() ) { 
              
          Book Temp = bb2[i];
          bb2[i]=bb2[j];
          bb2[j]=Temp;
          
          }
          
         }
          } 
            return bb2;
        }

}

class Book
{
    private int id;
    private String title;
    private String author;
    private double price;
       
       
    public Book(int id,String title,String author,double price)
       {
        
    this.id=id;
    this.title=title;
    this.author=author;
    this.price=price;

       } 
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}



