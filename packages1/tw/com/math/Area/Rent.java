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
		System.out.println("����"+n+"������Τ�έ��n�� :"+(n*n1));
	}
	public void perimeter(){
		System.out.println("����"+n+"�e��"+n1+"������ΩP���� :"+((2*n)+(2*n1)) );
	}
}