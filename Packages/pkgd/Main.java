package pkgd;
import java.util.*;
import java.lang.*;
//import pkga.Vehicle;
import pkgb.RV;
import pkgc.Jeep;

public class Main{
	
	public static void main(String[] args) {
		
		RV r = new RV();
		Jeep j =new Jeep();
		r.start();
		r.breaks();
		j.start();
		j.breaks();
	}
}