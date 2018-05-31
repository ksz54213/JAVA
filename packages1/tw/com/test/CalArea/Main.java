package tw.com.test.CalArea;
import java.lang.*;
import java.util.*;
import tw.com.math.Area.*;
import tw.com.math.Area.*;


public class Main{
	public static void main(String[] args) {
		Rent r = new Rent(3,6);
		Square s = new Square(5);

		s.Area();
		s.perimeter();
		r.Area();
		r.perimeter();

	}
}
