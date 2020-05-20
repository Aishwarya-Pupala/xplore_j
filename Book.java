
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Sol{
	public static void main(String[] args) {
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
			   price=sc.nextDouble();
			   b[i]=new Book(id,title,author,price);
			   
		   }
		   
		  
		   Book[] b2=sortBooksByPrice(b);
		
	
		  display(b2);
		  	  
		   }

	
	public static void display(Book[] b2) {

	   for (int i = 0; i< b2.length; i++) {
		   System.out.println(b2[i].getId()+" "+b2[i].getTitle()+" "+b2[i].getAuthor()+" "+b2[i].getPrice()) ;
	   }
	   
	   
	   }
	
	
	  public static Book[] sortBooksByPrice(Book[] b) { 
		  System.out.println("hi");
		 //Book[] Temp=new Book[4];
		  
	
		  for (int i = 0; i< b.length; i++) { 
			  for (int j = i + 1; j < b.length; j++) {
				 
		  if(b[i].getPrice() > b[j].getPrice()) { 
			  
		  Book Temp = b[i];
		  b[i]=b[j];
		  b[j]=Temp;
		  
		  }

		  } 
		}		
		  
		/*
		 * double Temp = b[i].getPrice(); b[i].setPrice(b[j].getPrice());
		 * b[j].setPrice(Temp);
		 */
		  
		  		  return b;
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
	this.price=price;
	this.author=author;
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
