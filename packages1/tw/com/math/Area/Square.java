package tw.com.math.Area;
import java.lang.*;
import java.util.*;

public class Square{

	private double n;
	public Square(double n){
		this.n=n;
	}
	public void Area(){
		System.out.println("�����"+n+"������έ��n�� :"+(n*n));
	}
	public void perimeter(){
		System.out.println("�����"+n+"������ΩP���� :"+(4*n));
	}
}