import java.lang.*;
import java.util.*;
public class interface1{
    public static void main(String args[])
    {
         CCalculator obj1 = new CCalculator();
         double a,b;
         a=Math.random()*20;
         b=Math.random()*10;
         
         System.out.println(a + " Add " + b + " = " +obj1.Add(a,b));
         System.out.println(a + " Sub " + b + " = " +obj1.Sub(a,b));
         System.out.println(a + " Mul " + b + " = " +obj1.Mul(a,b));
         System.out.println(a + " Div " + b + " = " +obj1.Div(a,b));
         System.out.println("log(" + a + ") = "   +obj1.LOG(a));
         System.out.println("ln(" + a + ") = "    +obj1.LN(a));
               
    }    
}    
  
interface IBasicCompute{
 	double Add(double a,double b);
 	double  Sub(double a,double b);
 	double Mul(double a,double b);
 	double Div(double a,double b);
 	
 }
interface IAdvCompute{
	double e = 2.71828182845905;
	double LOG(double a);
	double LN(double a);
}
class CCalculator implements IBasicCompute,IAdvCompute{
	public double resualt;
	@Override public double  Add(double a,double b){
		resualt = a+b;
		return resualt;
	}

	@Override public double  Sub(double a,double b){
		resualt = a-b;
		return resualt;
	}	

	@Override public double  Mul(double a,double b){
		resualt = a*b;
		return resualt;
	}

	@Override public double  Div(double a,double b){
		resualt = a/b;
		return resualt;
	}
	@Override public double LOG(double a){
		
		resualt = Math.log10(a);
		return resualt;
	}
	@Override public double LN(double a){
		resualt = Math.log10(a)/Math.log10(e);
		return resualt;
	}


}