import java.lang.*;
import java.io.*;
public class Thread_01        
{
    public static void main(String args[])
    {    	  
    	     String str1=new String();
    	     
    	     CDinner Soup = new CDinner("��");
    	     CDinner Salad = new CDinner("�F��");
    	     CDinner Entree = new CDinner("�D��");
    	     CDinner Dessert = new CDinner("���I");    	     
    	     
    	     Soup.start(); 
    	     try {
    	    	 Soup.join();
    	    	 Soup.Sleep();
    	    	 Salad.start(); 
    	    	try {
    	    	    Salad.join();
    	    		Salad.Sleep();
    	    	    Entree.start();
    	    		 try {
    	    			 Entree.join();
    	    			 Entree.Sleep();
    	    			 Dessert.start();
    	    			 Dessert.Sleep();
    	    		 }
    	    		 catch(Exception e) {}
    	    	 }
    	    	catch(Exception e) {}
    	     }
    	     catch(Exception e) {}
    	       
    	         	     
    }        
}    
