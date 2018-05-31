package tw.com.math.Area;
import java.lang.*;
import java.util.*;

public class Rent{

	private double n,n1;
	public Rent(double n,double n1){
		this.n=n;
		this.n1 = n1;
	}
	public void Area(){
		System.out.println("長為"+n+"的長方形方形面積為 :"+(n*n1));
	}
	public void perimeter(){
		System.out.println("長為"+n+"寬為"+n1+"的長方形周長為 :"+((2*n)+(2*n1)) );
	}
}