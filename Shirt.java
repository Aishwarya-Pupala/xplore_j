
import java.util.Scanner;

public class Solution_shirt {
    public static void main(String args[] ) throws Exception {
        /* Do not alter code in main method */
       Shirt[] shirts = new Shirt[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<5;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }  
            

        double price = sc.nextDouble();
        
        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));            
        }
        
        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);
        
        for(Shirt s: result)
        {
            System.out.println(s.getTag()+" "+s.getPrice()+ " " + s.getBrand());
        }
    }
    
    
    public static double getDiscountPrice(Shirt s) {
    	double p,k;
   
  
    	
    		 if (Character.toString(s.getG()).equals("m")) {
    			 p= s.getPrice()-(s.getPrice()*(10/100));
    			
    			 s.setPrice(p);
    			 k=s.getPrice();
    			 System.out.println("price m");
    			 System.out.println(k);
    			 System.out.println("----------------");
    		 }
    		 if (Character.toString(s.getG()).equals("f")) {
    			 p= s.getPrice()-s.getPrice()*(20/100);
    			 
    			 s.setPrice(p);

    		 }
    		 if (Character.toString(s.getG()).equals("u")) {
    			 p= s.getPrice()-s.getPrice()*(30/100);
    			 s.setPrice(p);
    		 }
         
    	return s.getPrice();
    }
    public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] s,double price) {
    
		
		  for (int i = 0; i< s.length; i++) {
			  
			  for (int j = i + 1; j < s.length;j++) {
	
		  if(s[i].getPrice() > s[j].getPrice()) {
		  
		  Shirt T = s[i]; 
		  s[i]=s[j]; 
		  s[j]=T;
		  
		  }
		  
		  
		  } }
		 
		/*
		 * Shirt s2=null;
		 * 
		 * for(int i=0;i<s.length;i++) { if(s[i].getPrice()>price) { s2=s[i]; } }
		 * System.out.print(s2);
		 */
		  
    	  return s;
    }
    
}   


class Shirt
{
    //define the class as per details shared in the question
	
	int tag;
	String brand;
	double price;
	char g;
	
	
	public Shirt(int tag, String brand, double price, char g) {
		super();
		this.tag = tag;
		this.brand = brand;
		this.price = price;
		this.g = g;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public char getG() {
		return g;
	}
	public void setG(char g) {
		this.g = g;
	}
	
	
}
