package tw.com.math.Area;
import java.lang.*;
import java.util.*;

public class Square{

	private double n;
	public Square(double n){
		this.n=n;
	}
	public void Area(){
		System.out.println("邊長為"+n+"的正方形面積為 :"+(n*n));
	}
	public void perimeter(){
		System.out.println("邊長為"+n+"的正方形周長為 :"+(4*n));
	}
}